// Clase abstracta Vehiculo
abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected String placa;
    protected String tipoCombustible;

    public Vehiculo(String marca, String modelo, String placa, String tipoCombustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.tipoCombustible = tipoCombustible;
    }

    public abstract void estacionar();
    public abstract String obtenerInformacion();
}

// Interfaz Mantenimiento
interface Mantenimiento {
    void realizarMantenimiento();
    double calcularCostoMantenimiento();
}

// Clase Auto que extiende Vehiculo e implementa Mantenimiento
class Auto extends Vehiculo implements Mantenimiento {
    private int puertas;
    private int capacidadPasajeros;

    public Auto(String marca, String modelo, String placa, String tipoCombustible, int puertas, int capacidadPasajeros) {
        super(marca, modelo, placa, tipoCombustible);
        this.puertas = puertas;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    public void estacionar() {
        System.out.println("El auto está estacionado.");
    }

    @Override
    public String obtenerInformacion() {
        return "Auto [Marca: " + marca + ", Modelo: " + modelo + ", Placa: " + placa + ", Combustible: " + tipoCombustible + "]";
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento al auto.");
    }

    @Override
    public double calcularCostoMantenimiento() {
        return 500.0; // Costo base del mantenimiento
    }
}

// Clase Motocicleta que extiende Vehiculo e implementa Mantenimiento
class Motocicleta extends Vehiculo implements Mantenimiento {
    private int cilindraje;
    private String tipo;

    public Motocicleta(String marca, String modelo, String placa, String tipoCombustible, int cilindraje, String tipo) {
        super(marca, modelo, placa, tipoCombustible);
        this.cilindraje = cilindraje;
        this.tipo = tipo;
    }

    @Override
    public void estacionar() {
        System.out.println("La motocicleta está estacionada.");
    }

    @Override
    public String obtenerInformacion() {
        return "Motocicleta [Marca: " + marca + ", Modelo: " + modelo + ", Placa: " + placa + ", Combustible: " + tipoCombustible + "]";
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento a la motocicleta.");
    }

    @Override
    public double calcularCostoMantenimiento() {
        return 200.0; // Costo base del mantenimiento
    }
}

// Clase principal para probar el sistema
public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Auto
        Auto auto = new Auto("Toyota", "Corolla", "ABC123", "Gasolina", 4, 5);
        System.out.println(auto.obtenerInformacion());
        auto.estacionar();
        auto.realizarMantenimiento();
        System.out.println("Costo mantenimiento: $" + auto.calcularCostoMantenimiento());

        // Crear un objeto de la clase Motocicleta
        Motocicleta moto = new Motocicleta("Honda", "CBR500R", "XYZ789", "Gasolina", 500, "Deportiva");
        System.out.println(moto.obtenerInformacion());
        moto.estacionar();
        moto.realizarMantenimiento();
        System.out.println("Costo mantenimiento: $" + moto.calcularCostoMantenimiento());
    }
}
