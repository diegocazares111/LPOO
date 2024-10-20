class Program
{
    static void Main(string[] args)
    {
        Persona p = new Persona();
        p.SetNombre("Diego");
        p.SetEdad(20);
        p.Comer("Arrachera");

        Estudiante e = new Estudiante();
        e.SetNombre("Diego Cazares");
        e.SetEdad(20);
        e.SetCarrera("ISTE");
        e.Estudiar("POO");

        Console.WriteLine("Persona: " + p.GetNombre() + ", " + p.GetEdad() + " años");
        Console.WriteLine("Estudiante: " + e.GetNombre() + ", estudiando " + e.GetCarrera());
    }
}