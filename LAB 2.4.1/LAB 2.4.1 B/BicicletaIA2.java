public class BicicletaIA2 {

    // Atributos principales de la bicicleta
    private String marca;
    private String modelo;
    private double peso;
    private Cuadro cuadro;
    private Rueda ruedaDelantera;
    private Rueda ruedaTrasera;

    // Constructor principal para inicializar la bicicleta y sus componentes
    public BicicletaIA2(String marca, String modelo, double peso, double tamañoCuadro, double tamañoRueda, String colorCuadro) {
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        this.cuadro = new Cuadro(tamañoCuadro, colorCuadro);
        this.ruedaDelantera = new Rueda(tamañoRueda);
        this.ruedaTrasera = new Rueda(tamañoRueda);
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Cuadro getCuadro() {
        return cuadro;
    }

    public Rueda getRuedaDelantera() {
        return ruedaDelantera;
    }

    public Rueda getRuedaTrasera() {
        return ruedaTrasera;
    }

    // Clase estática anidada: Cuadro
    public static class Cuadro {
        private double tamaño; // Tamaño en pulgadas
        private String color;

        // Constructor
        public Cuadro(double tamaño, String color) {
            this.tamaño = tamaño;
            this.color = color;
        }

        // Getters y Setters
        public double getTamaño() {
            return tamaño;
        }

        public void setTamaño(double tamaño) {
            this.tamaño = tamaño;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }

    // Clase estática anidada: Rueda
    public static class Rueda {
        private double tamaño; // Tamaño en pulgadas

        // Constructor
        public Rueda(double tamaño) {
            this.tamaño = tamaño;
        }

        // Getters y Setters
        public double getTamaño() {
            return tamaño;
        }

        public void setTamaño(double tamaño) {
            this.tamaño = tamaño;
        }
    }

    // Clase principal para demostrar el uso
    public static void main(String[] args) {
        // Crear un objeto de bicicleta
        BicicletaIA2 bicicleta = new BicicletaIA2("Trek", "Domane SL7", 8.2, 54.5, 29, "Azul");

        // Mostrar atributos de la bicicleta y sus componentes
        System.out.println("Marca: " + bicicleta.getMarca());
        System.out.println("Modelo: " + bicicleta.getModelo());
        System.out.println("Peso: " + bicicleta.getPeso() + " kg");
        System.out.println("Tamaño del cuadro: " + bicicleta.getCuadro().getTamaño() + " pulgadas");
        System.out.println("Color del cuadro: " + bicicleta.getCuadro().getColor());
        System.out.println("Tamaño de la rueda delantera: " + bicicleta.getRuedaDelantera().getTamaño() + " pulgadas");
        System.out.println("Tamaño de la rueda trasera: " + bicicleta.getRuedaTrasera().getTamaño() + " pulgadas");

        // Modificar atributos
        bicicleta.getCuadro().setColor("Rojo");
        bicicleta.getRuedaDelantera().setTamaño(27.5);

        // Mostrar atributos actualizados
        System.out.println("\n--- Atributos actualizados ---");
        System.out.println("Color del cuadro: " + bicicleta.getCuadro().getColor());
        System.out.println("Tamaño de la rueda delantera: " + bicicleta.getRuedaDelantera().getTamaño() + " pulgadas");
    }
}
