# Caso #4 — “El paciente olvidó inicializarse”

## Tema: Clases, objetos y constructores

### Síntomas
El sistema crea estudiantes, pero los nombres aparecen como `null`.

### Código del paciente

class Estudiante {

    String nombre;

    Estudiante(String n) {
        
    }

    void mostrar() {
        System.out.println(nombre);
    }
}

public class Main {

    public static void main(String[] args) {

        Estudiante e = new Estudiante("Carlos");

        e.mostrar();

    }
}

### Preguntas para el equipo

1. ¿Por qué aparece `null`?

	Porque el constructor no esta indicando el valor de nombre al parametro que se le pasa, es 	decir, no tiene como indicarlo por lo que el programa lo coloca null.

2. ¿Qué está faltando en el constructor?

	Está faltando this.nombre para inicializar el atributo de la clase Estudiante (nombre). Por 	consiguiente, al no haber otorgado un valor o inicializado el programa, lo retorna como 	null.

3. ¿Cómo se corrige usando `this`?

	this.nombre = n;
	
4. ¿Cuál sería la salida correcta?

	En este caso, la salida sería Carlos, ya que es el valor que se le esta pasando al atributo en el Main.

### Código corregido:

class Estudiante {

    String nombre;

    Estudiante(String n) {
        this.nombre = n;
    }

    void mostrar() {
        System.out.println(nombre);
    }
}

public class Main {

    public static void main(String[] args) {

        Estudiante e = new Estudiante("Carlos");

        e.mostrar();

    }
}

## Integrantes:

- Julymar Santos Balbi (1000-5890)
- Lillianna Cepeda Candelaria (1000-5856)
- Jazmine Minaya Peralta (1000-6143)
- Johanny Gonzalez De Jesús (1000-7697)
- Rey Enmanuel Marte Pichardo (1000-5925)