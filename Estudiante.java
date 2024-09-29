public class Estudiante {
    private double promedio;
    private int materias;
    private double[] calificaciones;

    // Constructor
    public Estudiante(double promedio, int materias, double[] calificaciones) {
        this.promedio = promedio;
        this.materias = materias;
        this.calificaciones = calificaciones;
    }

    // Getters y Setters
    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public int getMaterias() {
        return materias;
    }

    public void setMaterias(int materias) {
        this.materias = materias;
    }

    public double[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(double[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    // Método setGet
    public void setGet(String atributo, Object valor) {
        switch (atributo) {
            case "promedio":
                if (valor instanceof Double) {
                    setPromedio((Double) valor);
                    System.out.println("Promedio actualizado: " + getPromedio());
                }
                break;
            case "materias":
                if (valor instanceof Integer) {
                    setMaterias((Integer) valor);
                    System.out.println("Materias actualizadas: " + getMaterias());
                }
                break;
            case "calificaciones":
                if (valor instanceof double[]) {
                    setCalificaciones((double[]) valor);
                    System.out.println("Calificaciones actualizadas: " + java.util.Arrays.toString(getCalificaciones()));
                }
                break;
            default:
                System.out.println("Atributo no reconocido");
        }
    }
}

// Clase Main para demostración (no declarada como public)
class Main {
    public static void main(String[] args) {
        // Creación de objetos Estudiante
        Estudiante estudiante1 = new Estudiante(8.5, 5, new double[]{7.5, 8.0, 9.0, 8.5, 9.5});
        Estudiante estudiante2 = new Estudiante(9.0, 4, new double[]{9.0, 9.5, 8.5, 9.0});
        Estudiante estudiante3 = new Estudiante(7.8, 6, new double[]{7.0, 8.0, 7.5, 8.5, 7.5, 8.5});

        // Demostración de uso de atributos
        System.out.println("Estudiante 1 - Promedio: " + estudiante1.getPromedio());
        System.out.println("Estudiante 2 - Materias: " + estudiante2.getMaterias());
        System.out.println("Estudiante 3 - Calificaciones: " + java.util.Arrays.toString(estudiante3.getCalificaciones()));

        // Demostración del método setGet
        System.out.println("\nDemostración del método setGet:");
        estudiante1.setGet("promedio", 8.7);
        estudiante2.setGet("materias", 5);
        estudiante3.setGet("calificaciones", new double[]{8.0, 8.5, 8.0, 9.0, 8.5, 9.0});
    }
}