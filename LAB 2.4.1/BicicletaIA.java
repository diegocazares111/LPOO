public class BicicletaIA {
    private String marca;
    private String color;
    private double precio;
    private Rueda ruedaDelantera;
    private Rueda ruedaTrasera;
    private Cuadro cuadro;

    public BicicletaIA(String marca, String color, double precio) {
        this.marca = marca;
        this.color = color;
        this.precio = precio;
    }

    // Getters y setters
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
    
    public Rueda getRuedaDelantera() { return ruedaDelantera; }
    public void setRuedaDelantera(Rueda rueda) { this.ruedaDelantera = rueda; }
    
    public Rueda getRuedaTrasera() { return ruedaTrasera; }
    public void setRuedaTrasera(Rueda rueda) { this.ruedaTrasera = rueda; }
    
    public Cuadro getCuadro() { return cuadro; }
    public void setCuadro(Cuadro cuadro) { this.cuadro = cuadro; }
}

class Rueda {
    private int diametro;
    private String tipo;
    private boolean tubeless;

    public Rueda(int diametro, String tipo, boolean tubeless) {
        this.diametro = diametro;
        this.tipo = tipo;
        this.tubeless = tubeless;
    }

    // Getters y setters
    public int getDiametro() { return diametro; }
    public void setDiametro(int diametro) { this.diametro = diametro; }
    
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    
    public boolean isTubeless() { return tubeless; }
    public void setTubeless(boolean tubeless) { this.tubeless = tubeless; }
}

class Cuadro {
    private String talla;
    private String material;
    private double peso;

    public Cuadro(String talla, String material, double peso) {
        this.talla = talla;
        this.material = material;
        this.peso = peso;
    }

    // Getters y setters
    public String getTalla() { return talla; }
    public void setTalla(String talla) { this.talla = talla; }
    
    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }
    
    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
}

class MainBicicleta {
    public static void main(String[] args) {
        // Crear bicicleta
        BicicletaIA bici = new BicicletaIA("Trek", "Rojo", 1299.99);
        
        // Crear y asignar ruedas
        Rueda ruedaDelantera = new Rueda(29, "MTB", true);
        Rueda ruedaTrasera = new Rueda(29, "MTB", true);
        bici.setRuedaDelantera(ruedaDelantera);
        bici.setRuedaTrasera(ruedaTrasera);
        
        // Crear y asignar cuadro
        Cuadro cuadro = new Cuadro("M", "Aluminio", 1.8);
        bici.setCuadro(cuadro);
        
        // Imprimir información
        System.out.println("Bicicleta marca: " + bici.getMarca());
        System.out.println("Color: " + bici.getColor());
        System.out.println("Tamaño ruedas: " + bici.getRuedaDelantera().getDiametro() + "''");
        System.out.println("Talla cuadro: " + bici.getCuadro().getTalla());
    }
}