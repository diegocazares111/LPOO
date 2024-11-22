public class BicicletaModalidadA {
    private String marca;
    private String modelo;
    private double precio;
    private Rueda ruedaDelantera;
    private Rueda ruedaTrasera;
    private Cuadro cuadro;

    public BicicletaModalidadA(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    // Getters y Setters principales
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
    
    public Rueda getRuedaDelantera() { return ruedaDelantera; }
    public void setRuedaDelantera(Rueda rueda) { this.ruedaDelantera = rueda; }
    
    public Rueda getRuedaTrasera() { return ruedaTrasera; }
    public void setRuedaTrasera(Rueda rueda) { this.ruedaTrasera = rueda; }
    
    public Cuadro getCuadro() { return cuadro; }
    public void setCuadro(Cuadro cuadro) { this.cuadro = cuadro; }

    // Clase anidada Rueda
    public static class Rueda {
        private int diametro;
        private String marca;
        private boolean tubeless;

        public Rueda(int diametro, String marca, boolean tubeless) {
            this.diametro = diametro;
            this.marca = marca;
            this.tubeless = tubeless;
        }

        public int getDiametro() { return diametro; }
        public void setDiametro(int diametro) { this.diametro = diametro; }
        
        public String getMarca() { return marca; }
        public void setMarca(String marca) { this.marca = marca; }
        
        public boolean isTubeless() { return tubeless; }
        public void setTubeless(boolean tubeless) { this.tubeless = tubeless; }
    }

    // Clase anidada Cuadro
    public static class Cuadro {
        private String material;
        private String talla;
        private double peso;

        public Cuadro(String material, String talla, double peso) {
            this.material = material;
            this.talla = talla;
            this.peso = peso;
        }

        public String getMaterial() { return material; }
        public void setMaterial(String material) { this.material = material; }
        
        public String getTalla() { return talla; }
        public void setTalla(String talla) { this.talla = talla; }
        
        public double getPeso() { return peso; }
        public void setPeso(double peso) { this.peso = peso; }
    }

    @Override
    public String toString() {
        return "Bicicleta {" +
            "\n  marca='" + marca + "'" +
            "\n  modelo='" + modelo + "'" +
            "\n  precio=" + precio +
            "\n  ruedaDelantera=" + ruedaDelantera +
            "\n  ruedaTrasera=" + ruedaTrasera +
            "\n  cuadro=" + cuadro +
            "\n}";
    }

    public static void main(String[] args) {
        // Crear la bicicleta base
        BicicletaModalidadA bici = new BicicletaModalidadA("Trek", "X-Caliber 8", 1299.99);
        
        // Crear y asignar las ruedas
        Rueda ruedaDelantera = new Rueda(29, "Bontrager", true);
        Rueda ruedaTrasera = new Rueda(29, "Bontrager", true);
        bici.setRuedaDelantera(ruedaDelantera);
        bici.setRuedaTrasera(ruedaTrasera);
        
        // Crear y asignar el cuadro
        Cuadro cuadro = new Cuadro("Aluminio", "M", 1.8);
        bici.setCuadro(cuadro);
        
        // Mostrar la bicicleta creada
        System.out.println("Bicicleta creada:");
        System.out.println(bici);
    }
}