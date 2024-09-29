#include <iostream>
#include <string>

class Estudiante {
private:
    std::string nombre;
    int edad;
    float promedio;

public:
    // sets
    void setNombre(std::string n) { nombre = n; }
    void setEdad(int e) { edad = e; }
    void setPromedio(float p) { promedio = p; }

    //gets
    std::string getNombre() { return nombre; }
    int getEdad() { return edad; }
    float getPromedio() { return promedio; }

    //setGet (segunda versión)
    void setGet(std::string atributo, std::string valor) {
        if (atributo == "nombre") {
            setNombre(valor);
            std::cout << "El nombre establecido es: " << getNombre() << std::endl;
        } else if (atributo == "edad") {
            setEdad(std::stoi(valor));
            std::cout << "La edad establecida es: " << getEdad() << std::endl;
        } else if (atributo == "promedio") {
            setPromedio(std::stof(valor));
            std::cout << "El promedio establecido es: " << getPromedio() << std::endl;
        } else {
            std::cout << "Atributo no reconocido" << std::endl;
        }
    }
};

int main() {
    Estudiante estudiantes[3];

    // Capturar datos de los estudiantes
    for (int i = 0; i < 3; i++) {
        std::string nombre;
        int edad;
        float promedio;

        std::cout << "Ingrese los datos del estudiante " << i+1 << ":" << std::endl;
        std::cout << "Nombre: ";
        std::getline(std::cin, nombre);
        std::cout << "Edad: ";
        std::cin >> edad;
        std::cout << "Promedio: ";
        std::cin >> promedio;
        std::cin.ignore(); // Limpiar el buffer

        estudiantes[i].setNombre(nombre);
        estudiantes[i].setEdad(edad);
        estudiantes[i].setPromedio(promedio);
    }

    // Desplegar datos de los estudiantes
    std::cout << "\nDatos de los estudiantes:" << std::endl;
    for (int i = 0; i < 3; i++) {
        std::cout << "Estudiante " << i+1 << ":" << std::endl;
        std::cout << "Nombre: " << estudiantes[i].getNombre() << std::endl;
        std::cout << "Edad: " << estudiantes[i].getEdad() << std::endl;
        std::cout << "Promedio: " << estudiantes[i].getPromedio() << std::endl;
        std::cout << std::endl;
    }

    // Demostración del método setGet
    std::cout << "Demostracion del metodo setGet:" << std::endl;
    estudiantes[0].setGet("nombre", "Diego");
    estudiantes[0].setGet("edad", "20");
    estudiantes[0].setGet("promedio", "99.5");

    return 0;
}