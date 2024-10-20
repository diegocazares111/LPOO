using System;

class Persona
{
    public string nombre;
    public int edad;
    public string genero;
    protected string direccion;
    private string dni;

    public void SetNombre(string n) { nombre = n; }
    public string GetNombre() { return nombre; }

    public void SetEdad(int e) { edad = e; }
    public int GetEdad() { return edad; }

    public void SetGenero(string g) { genero = g; }
    public string GetGenero() { return genero; }

    protected void SetDireccion(string d) { direccion = d; }
    protected string GetDireccion() { return direccion; }

    private void SetDNI(string d) { dni = d; }
    private string GetDNI() { return dni; }

    public void Comer(string comida)
    {
        Console.WriteLine("Estoy comiendo " + comida);
    }

    protected void Dormir(int horas)
    {
        Console.WriteLine("Voy a dormir " + horas + " horas");
    }

    private void TomarShower(float temp)
    {
        Console.WriteLine("Duchándome con agua a " + temp + " grados");
    }
}