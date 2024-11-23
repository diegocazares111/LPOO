// Clase abstracta Vehiculo
abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected String placa;

    public Vehiculo(String marca, String modelo, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }

    public abstract String obtenerInformacion();
}

// Interfaz Mantenimiento
interface Mantenimiento {
    void realizarMantenimiento();
    double calcularCostoMantenimiento();
}

// Interfaz Seguro
interface Seguro {
    void contratarSeguro(String tipo);
    String obtenerCobertura();
}

// Clase Auto que extiende Vehiculo e implementa Mantenimiento y Seguro
class Auto extends Vehiculo implements Mantenimiento, Seguro {
    private int puertas;
    private int capacidadPasajeros;
    private String tipoSeguro;
    private String coberturaSeguro;

    public Auto(String marca, String modelo, String placa, int puertas, int capacidadPasajeros) {
        super(marca, modelo, placa);
        this.puertas = puertas;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    public String obtenerInformacion() {
        return "Auto [Marca: " + marca + ", Modelo: " + modelo + ", Placa: " + placa + ", Puertas: " + puertas + ", Capacidad: " + capacidadPasajeros + "]";
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento al auto.");
    }

    @Override
    public double calcularCostoMantenimiento() {
        return 500.0; // Costo base del mantenimiento
    }

    @Override
    public void contratarSeguro(String tipo) {
        this.tipoSeguro = tipo;
        this.coberturaSeguro = "Cobertura estándar para " + tipo + ".";
    }

    @Override
    public String obtenerCobertura() {
        return coberturaSeguro;
    }
}

// Clase Motocicleta que extiende Vehiculo e implementa Mantenimiento y Seguro
class Motocicleta extends Vehiculo implements Mantenimiento, Seguro {
    private int cilindraje;
    private String tipo;
    private String tipoSeguro;
    private String coberturaSeguro;

    public Motocicleta(String marca, String modelo, String placa, int cilindraje, String tipo) {
        super(marca, modelo, placa);
        this.cilindraje = cilindraje;
        this.tipo = tipo;
    }

    @Override
    public String obtenerInformacion() {
        return "Motocicleta [Marca: " + marca + ", Modelo: " + modelo + ", Placa: " + placa + ", Cilindraje: " + cilindraje + ", Tipo: " + tipo + "]";
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento a la motocicleta.");
    }

    @Override
    public double calcularCostoMantenimiento() {
        return 200.0; // Costo base del mantenimiento
    }

    @Override
    public void contratarSeguro(String tipo) {
        this.tipoSeguro = tipo;
        this.coberturaSeguro = "Cobertura estándar para " + tipo + ".";
    }

    @Override
    public String obtenerCobertura() {
        return coberturaSeguro;
    }
}

// Clase principal para probar el sistema
public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Auto
        Auto auto = new Auto("Toyota", "Corolla", "ABC123", 4, 5);
        System.out.println(auto.obtenerInformacion());
        auto.realizarMantenimiento();
        System.out.println("Costo mantenimiento: $" + auto.calcularCostoMantenimiento());
        auto.contratarSeguro("todo riesgo");
        System.out.println("Cobertura del seguro: " + auto.obtenerCobertura());

        // Crear un objeto de la clase Motocicleta
        Motocicleta moto = new Motocicleta("Honda", "CBR500R", "XYZ789", 500, "Deportiva");
        System.out.println(moto.obtenerInformacion());
        moto.realizarMantenimiento();
        System.out.println("Costo mantenimiento: $" + moto.calcularCostoMantenimiento());
        moto.contratarSeguro("básico");
        System.out.println("Cobertura del seguro: " + moto.obtenerCobertura());
    }
}
