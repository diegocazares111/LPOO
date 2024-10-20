// Archivo: Persona.java
public class Persona {
    // Atributos demográficos
    public String nombre;  // Público: accesible desde cualquier parte
    public int edad;       // Público: accesible desde cualquier parte
    private String dni;    // Privado: solo accesible dentro de esta clase
    protected String direccion;  // Protegido: accesible en esta clase y sus subclases
    String genero;         // Por defecto: accesible en el mismo paquete

    // Constructor
    public Persona(String nombre, int edad, String dni, String direccion, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.direccion = direccion;
        this.genero = genero;
    }

    // Métodos públicos
    public void correr(int distancia) {
        System.out.println(nombre + " está corriendo " + distancia + " metros.");
    }

    // Método protegido
    protected void dormir(int horas) {
        System.out.println(nombre + " está durmiendo por " + horas + " horas.");
    }

    // Método privado
    private void tomarShower(int minutos) {
        System.out.println(nombre + " está tomando una ducha de " + minutos + " minutos.");
    }

    // Método público para acceder al método privado
    public void aseo(int minutos) {
        tomarShower(minutos);
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("DNI: " + dni);
        System.out.println("Dirección: " + direccion);
        System.out.println("Género: " + genero);
    }
}

// Archivo: Main.java
public class Main {
    public static void main(String[] args) {
        // Creamos un objeto de tipo Persona
        Persona persona = new Persona("Juan", 25, "12345678A", "Calle Principal 123", "Masculino");

        // Mostramos la información de la persona
        System.out.println("Información de la persona:");
        persona.mostrarInfo();

        // Invocamos los métodos
        System.out.println("\nActividades de la persona:");
        persona.correr(100);
        persona.dormir(8);  // Esto funcionará porque estamos en la misma clase
        persona.aseo(15);   // Llamamos al método público que internamente llama al método privado
    }
}