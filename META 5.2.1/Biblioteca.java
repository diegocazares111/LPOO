import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

// Clase principal que gestiona la biblioteca
public class Biblioteca {
    private final ConcurrentHashMap<String, Libro> catalogo;
    private final ConcurrentHashMap<String, Usuario> usuarios;
    private final SistemaNotificaciones sistemaNotificaciones;
    private final ReentrantLock registroLock;

    public Biblioteca() {
        this.catalogo = new ConcurrentHashMap<>();
        this.usuarios = new ConcurrentHashMap<>();
        this.sistemaNotificaciones = new SistemaNotificaciones();
        this.registroLock = new ReentrantLock();
    }

    public synchronized void agregarLibro(Libro libro) {
        catalogo.put(libro.getIsbn(), libro);
    }

    public synchronized boolean registrarUsuario(Usuario usuario) {
        try {
            registroLock.lock();
            if (!usuarios.containsKey(usuario.getId())) {
                usuarios.put(usuario.getId(), usuario);
                return true;
            }
            return false;
        } finally {
            registroLock.unlock();
        }
    }

    public boolean procesarReserva(String isbn, String usuarioId) {
        Libro libro = catalogo.get(isbn);
        Usuario usuario = usuarios.get(usuarioId);
        
        if (libro != null && usuario != null) {
            return libro.reservar(usuario);
        }
        return false;
    }
}

// Clase que representa un libro con control de concurrencia
public class Libro {
    private final String titulo;
    private final String autor;
    private final String isbn;
    private volatile boolean disponible;
    private final List<Reserva> reservas;
    private final ReentrantLock reservaLock;

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true;
        this.reservas = new ArrayList<>();
        this.reservaLock = new ReentrantLock();
    }

    public synchronized boolean reservar(Usuario usuario) {
        try {
            reservaLock.lock();
            if (disponible) {
                disponible = false;
                Reserva nuevaReserva = new Reserva(this, usuario);
                reservas.add(nuevaReserva);
                usuario.agregarReserva(nuevaReserva);
                return true;
            }
            return false;
        } finally {
            reservaLock.unlock();
        }
    }

    public synchronized void devolver() {
        disponible = true;
        notifyAll(); // Notifica a todos los hilos esperando por este libro
    }

    // Getters
    public String getIsbn() {
        return isbn;
    }
}

// Clase que representa un usuario del sistema
public class Usuario {
    private final String id;
    private final String nombre;
    private final List<Reserva> reservasActivas;
    private final ReentrantLock reservasLock;

    public Usuario(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.reservasActivas = new ArrayList<>();
        this.reservasLock = new ReentrantLock();
    }

    public synchronized void agregarReserva(Reserva reserva) {
        try {
            reservasLock.lock();
            reservasActivas.add(reserva);
        } finally {
            reservasLock.unlock();
        }
    }

    public String getId() {
        return id;
    }
}

// Clase que representa una reserva
public class Reserva {
    private final Libro libro;
    private final Usuario usuario;
    private final LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private volatile EstadoReserva estado;

    public Reserva(Libro libro, Usuario usuario) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaInicio = LocalDateTime.now();
        this.estado = EstadoReserva.ACTIVA;
    }

    public synchronized void cancelar() {
        estado = EstadoReserva.CANCELADA;
        libro.devolver();
    }
}

// Enumeración para estados de reserva
enum EstadoReserva {
    ACTIVA, FINALIZADA, CANCELADA
}

// Sistema de notificaciones asíncrono
public class SistemaNotificaciones {
    private final BlockingQueue<Notificacion> colaNotificaciones;
    private volatile boolean ejecutando;

    public SistemaNotificaciones() {
        this.colaNotificaciones = new LinkedBlockingQueue<>();
        this.ejecutando = true;
        iniciarProcesadorNotificaciones();
    }

    private void iniciarProcesadorNotificaciones() {
        Thread procesador = new Thread(() -> {
            while (ejecutando) {
                try {
                    Notificacion notificacion = colaNotificaciones.take();
                    procesarNotificacion(notificacion);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        });
        procesador.setDaemon(true);
        procesador.start();
    }

    private void procesarNotificacion(Notificacion notificacion) {
        // Implementación del procesamiento de notificaciones
        System.out.println("Procesando notificación: " + notificacion.getMensaje());
    }

    public void enviarNotificacion(String mensaje, Usuario usuario) {
        colaNotificaciones.offer(new Notificacion(mensaje, usuario));
    }
}

// Clase para representar una notificación
class Notificacion {
    private final String mensaje;
    private final Usuario usuario;

    public Notificacion(String mensaje, Usuario usuario) {
        this.mensaje = mensaje;
        this.usuario = usuario;
    }

    public String getMensaje() {
        return mensaje;
    }
}
