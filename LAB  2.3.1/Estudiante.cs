using System;
class Estudiante : Persona
{
    public string carrera;
    public int semestre;

    public void SetCarrera(string c) { carrera = c; }
    public string GetCarrera() { return carrera; }

    public void SetSemestre(int s) { semestre = s; }
    public int GetSemestre() { return semestre; }

    public void Estudiar(string materia)
    {
        Console.WriteLine("Estoy estudiando " + materia);
    }
}