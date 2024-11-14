public class CuerpoHumano {
    private double peso;
    private double altura;
    private String tipoSangre;
    private Corazon corazon;
    private Pulmon pulmonIzquierdo;
    private Pulmon pulmonDerecho;
    private Higado higado;
    private Apendice apendice;

    public CuerpoHumano(double peso, double altura, String tipoSangre) {
        this.peso = peso;
        this.altura = altura;
        this.tipoSangre = tipoSangre;
    }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
    
    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }
    
    public String getTipoSangre() { return tipoSangre; }
    public void setTipoSangre(String tipoSangre) { this.tipoSangre = tipoSangre; }
    
    public Corazon getCorazon() { return corazon; }
    public void setCorazon(Corazon corazon) { this.corazon = corazon; }
    
    public Pulmon getPulmonIzquierdo() { return pulmonIzquierdo; }
    public void setPulmonIzquierdo(Pulmon pulmon) { this.pulmonIzquierdo = pulmon; }
    
    public Pulmon getPulmonDerecho() { return pulmonDerecho; }
    public void setPulmonDerecho(Pulmon pulmon) { this.pulmonDerecho = pulmon; }
    
    public Higado getHigado() { return higado; }
    public void setHigado(Higado higado) { this.higado = higado; }
    
    public Apendice getApendice() { return apendice; }
    public void setApendice(Apendice apendice) { this.apendice = apendice; }

    class Corazon {
        private int ritmoCardiaco;
        private double tamano;
        private String estado;

        public Corazon(int ritmoCardiaco, double tamano, String estado) {
            this.ritmoCardiaco = ritmoCardiaco;
            this.tamano = tamano;
            this.estado = estado;
        }

        public int getRitmoCardiaco() { return ritmoCardiaco; }
        public void setRitmoCardiaco(int ritmoCardiaco) { this.ritmoCardiaco = ritmoCardiaco; }
        
        public double getTamano() { return tamano; }
        public void setTamano(double tamano) { this.tamano = tamano; }
        
        public String getEstado() { return estado; }
        public void setEstado(String estado) { this.estado = estado; }
    }

    class Pulmon {
        private double capacidad;
        private String posicion;
        private boolean funcional;

        public Pulmon(double capacidad, String posicion, boolean funcional) {
            this.capacidad = capacidad;
            this.posicion = posicion;
            this.funcional = funcional;
        }

        public double getCapacidad() { return capacidad; }
        public void setCapacidad(double capacidad) { this.capacidad = capacidad; }
        
        public String getPosicion() { return posicion; }
        public void setPosicion(String posicion) { this.posicion = posicion; }
        
        public boolean isFuncional() { return funcional; }
        public void setFuncional(boolean funcional) { this.funcional = funcional; }
    }

    class Higado {
        private double peso;
        private String estado;
        private double tamano;

        public Higado(double peso, String estado, double tamano) {
            this.peso = peso;
            this.estado = estado;
            this.tamano = tamano;
        }

        public double getPeso() { return peso; }
        public void setPeso(double peso) { this.peso = peso; }
        
        public String getEstado() { return estado; }
        public void setEstado(String estado) { this.estado = estado; }
        
        public double getTamano() { return tamano; }
        public void setTamano(double tamano) { this.tamano = tamano; }
    }

    class Apendice {
        private double longitud;
        private boolean inflamado;
        private String estado;

        public Apendice(double longitud, boolean inflamado, String estado) {
            this.longitud = longitud;
            this.inflamado = inflamado;
            this.estado = estado;
        }

        public double getLongitud() { return longitud; }
        public void setLongitud(double longitud) { this.longitud = longitud; }
        
        public boolean isInflamado() { return inflamado; }
        public void setInflamado(boolean inflamado) { this.inflamado = inflamado; }
        
        public String getEstado() { return estado; }
        public void setEstado(String estado) { this.estado = estado; }
    }

    public static void main(String[] args) {
        CuerpoHumano cuerpo = new CuerpoHumano(70.5, 1.75, "O+");
        
        Corazon corazon = cuerpo.new Corazon(72, 0.3, "Saludable");
        cuerpo.setCorazon(corazon);
        
        Pulmon pulmonIzq = cuerpo.new Pulmon(2.5, "Izquierdo", true);
        Pulmon pulmonDer = cuerpo.new Pulmon(2.7, "Derecho", true);
        cuerpo.setPulmonIzquierdo(pulmonIzq);
        cuerpo.setPulmonDerecho(pulmonDer);
        
        Higado higado = cuerpo.new Higado(1.5, "Normal", 0.8);
        cuerpo.setHigado(higado);
        
        Apendice apendice = cuerpo.new Apendice(0.1, false, "Normal");
        cuerpo.setApendice(apendice);
        
        System.out.println("Cuerpo humano creado exitosamente!");
    }
}