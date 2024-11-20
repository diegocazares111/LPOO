public class CuerpoHumanoIA {
    private double peso;
    private double altura;
    private String tipoSangre;
    private String presionArterial;
    private double temperatura;
    private Corazon corazon;
    private Pulmon pulmonIzquierdo;
    private Pulmon pulmonDerecho;
    private Higado higado;
    private Apendice apendice;

    public CuerpoHumanoIA(double peso, double altura, String tipoSangre) {
        this.peso = peso;
        this.altura = altura;
        this.tipoSangre = tipoSangre;
    }

    // Getters y setters
    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
    
    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }
    
    public String getTipoSangre() { return tipoSangre; }
    public void setTipoSangre(String tipoSangre) { this.tipoSangre = tipoSangre; }
    
    public String getPresionArterial() { return presionArterial; }
    public void setPresionArterial(String presionArterial) { this.presionArterial = presionArterial; }
    
    public double getTemperatura() { return temperatura; }
    public void setTemperatura(double temperatura) { this.temperatura = temperatura; }
    
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
}

class Corazon {
    private int ritmoCardiaco;
    private int presionSistolica;
    private int presionDiastolica;

    public Corazon(int ritmoCardiaco, int presionSistolica, int presionDiastolica) {
        this.ritmoCardiaco = ritmoCardiaco;
        this.presionSistolica = presionSistolica;
        this.presionDiastolica = presionDiastolica;
    }

    // Getters y setters
    public int getRitmoCardiaco() { return ritmoCardiaco; }
    public void setRitmoCardiaco(int ritmoCardiaco) { this.ritmoCardiaco = ritmoCardiaco; }
    
    public int getPresionSistolica() { return presionSistolica; }
    public void setPresionSistolica(int presionSistolica) { this.presionSistolica = presionSistolica; }
    
    public int getPresionDiastolica() { return presionDiastolica; }
    public void setPresionDiastolica(int presionDiastolica) { this.presionDiastolica = presionDiastolica; }
}

class Pulmon {
    private double capacidadVital;
    private int saturacionOxigeno;
    private int frecuenciaRespiratoria;

    public Pulmon(double capacidadVital, int saturacionOxigeno, int frecuenciaRespiratoria) {
        this.capacidadVital = capacidadVital;
        this.saturacionOxigeno = saturacionOxigeno;
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
    }

    // Getters y setters
    public double getCapacidadVital() { return capacidadVital; }
    public void setCapacidadVital(double capacidadVital) { this.capacidadVital = capacidadVital; }
    
    public int getSaturacionOxigeno() { return saturacionOxigeno; }
    public void setSaturacionOxigeno(int saturacionOxigeno) { this.saturacionOxigeno = saturacionOxigeno; }
    
    public int getFrecuenciaRespiratoria() { return frecuenciaRespiratoria; }
    public void setFrecuenciaRespiratoria(int frecuenciaRespiratoria) { this.frecuenciaRespiratoria = frecuenciaRespiratoria; }
}

class Higado {
    private double nivelEnzimas;
    private double tamano;
    private String funcionamiento;

    public Higado(double nivelEnzimas, double tamano, String funcionamiento) {
        this.nivelEnzimas = nivelEnzimas;
        this.tamano = tamano;
        this.funcionamiento = funcionamiento;
    }

    // Getters y setters
    public double getNivelEnzimas() { return nivelEnzimas; }
    public void setNivelEnzimas(double nivelEnzimas) { this.nivelEnzimas = nivelEnzimas; }
    
    public double getTamano() { return tamano; }
    public void setTamano(double tamano) { this.tamano = tamano; }
    
    public String getFuncionamiento() { return funcionamiento; }
    public void setFuncionamiento(String funcionamiento) { this.funcionamiento = funcionamiento; }
}

class Apendice {
    private double longitud;
    private String estado;
    private boolean inflamacion;

    public Apendice(double longitud, String estado, boolean inflamacion) {
        this.longitud = longitud;
        this.estado = estado;
        this.inflamacion = inflamacion;
    }

    // Getters y setters
    public double getLongitud() { return longitud; }
    public void setLongitud(double longitud) { this.longitud = longitud; }
    
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    
    public boolean isInflamacion() { return inflamacion; }
    public void setInflamacion(boolean inflamacion) { this.inflamacion = inflamacion; }
}

class MainCuerpoHumano {
    public static void main(String[] args) {
        // Crear cuerpo humano
        CuerpoHumanoIA persona = new CuerpoHumanoIA(70.5, 1.75, "O+");
        
        // Crear y asignar órganos
        Corazon corazon = new Corazon(72, 120, 80);
        persona.setCorazon(corazon);
        
        Pulmon pulmonIzq = new Pulmon(3.1, 98, 16);
        Pulmon pulmonDer = new Pulmon(3.3, 98, 16);
        persona.setPulmonIzquierdo(pulmonIzq);
        persona.setPulmonDerecho(pulmonDer);
        
        Higado higado = new Higado(30.5, 1.5, "Normal");
        persona.setHigado(higado);
        
        Apendice apendice = new Apendice(5.5, "Normal", false);
        persona.setApendice(apendice);
        
        // Imprimir información
        System.out.println("Tipo de sangre: " + persona.getTipoSangre());
        System.out.println("Ritmo cardíaco: " + corazon.getRitmoCardiaco());
        System.out.println("Saturación O2: " + pulmonIzq.getSaturacionOxigeno());
    }
}