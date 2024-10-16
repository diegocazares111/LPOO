using System;

namespace ProyectoPersona
{
    public class Persona
    {
        // Atributos
        private string nombre;
        private int edad;
        private string genero;
        private double altura;
        private double peso;

        // Métodos set y get
        public void setNombre(string nombre) { this.nombre = nombre; }
        public string getNombre() { return nombre; }

        public void setEdad(int edad) { this.edad = edad; }
        public int getEdad() { return edad; }

        public void setGenero(string genero) { this.genero = genero; }
        public string getGenero() { return genero; }

        public void setAltura(double altura) { this.altura = altura; }
        public double getAltura() { return altura; }

        public void setPeso(double peso) { this.peso = peso; }
        public double getPeso() { return peso; }

        // Métodos adicionales
        public static void comer(string alimento)
        {
            Console.WriteLine($"Comiendo {alimento}");
        }

        public void dormir(int horas)
        {
            Console.WriteLine($"Durmiendo por {horas} horas");
        }

        public void hacerEjercicio(string tipoEjercicio, int minutos)
        {
            Console.WriteLine($"Haciendo {tipoEjercicio} durante {minutos} minutos");
        }

        // Método para imprimir los datos de la persona
        public void imprimirDatos()
        {
            Console.WriteLine($"Nombre: {nombre}");
            Console.WriteLine($"Edad: {edad}");
            Console.WriteLine($"Género: {genero}");
            Console.WriteLine($"Altura: {altura} m");
            Console.WriteLine($"Peso: {peso} kg");
        }
    }

    public class Program
    {
        public static void Main(string[] args)
        {
            // Crear tres objetos Persona para los integrantes del equipo LPOO
            Persona german = new Persona();
            german.setNombre("German Vargas Gonzalez");
            german.setEdad(20);
            german.setGenero("Masculino");
            german.setAltura(1.70);
            german.setPeso(70);

            Persona milton = new Persona();
            milton.setNombre("Milton Manuel Castro Campos");
            milton.setEdad(20);
            milton.setGenero("Masculino");
            milton.setAltura(1.70);
            milton.setPeso(75);

            Persona luis = new Persona();
            luis.setNombre("Luis Diego Cazares Meraz");
            luis.setEdad(20);
            luis.setGenero("Masculino");
            luis.setAltura(1.80);
            luis.setPeso(85);

            // Imprimir datos y demostrar métodos para cada persona
            Console.WriteLine("Datos de los integrantes del equipo LPOO:");
            Console.WriteLine("\nIntegrante 1:");
            german.imprimirDatos();
            Persona.comer("manzana");
            german.dormir(7);
            german.hacerEjercicio("correr", 30);

            Console.WriteLine("\nIntegrante 2:");
            milton.imprimirDatos();
            Persona.comer("sandwich");
            milton.dormir(8);
            milton.hacerEjercicio("nadar", 45);

            Console.WriteLine("\nIntegrante 3:");
            luis.imprimirDatos();
            Persona.comer("ensalada");
            luis.dormir(6);
            luis.hacerEjercicio("ciclismo", 60);
        }
    }
}
