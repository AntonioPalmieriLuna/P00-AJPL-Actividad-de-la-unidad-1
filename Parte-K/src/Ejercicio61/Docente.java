package Ejercicio61;

/*
Diseño de la clase Docente antes de programar:

Atributos que tendrá:
- nombre: String (nombre del profesor)
- materia: String (asignatura que dicta)
- Experiencia: int (años de experiencia docente)

Métodos que tendrá:
- mostrarInfo(): muestra los datos del docente
- dictarClase(): simula la impartición de clase
- calificar(double nota): registra una calificación dada por el docente

Objetos reales que se podrían construir:
- Docente 1: "Carlos Gómez", dicta "Matemáticas", 5 años de experiencia
- Docente 2: "María Pérez", dicta "Programación", 8 años de experiencia
*/

public class Docente {
    private String nombre;
    private String materia;
    private int Experiencia;

    public Docente(String nombre, String materia, int Experiencia) {
        this.nombre = nombre;
        this.materia = materia;
        this.Experiencia = Experiencia;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + "\n" +
                "Materia: " + materia + "\n" +
                "Años de experiencia: " + Experiencia + "\n");
    }

    public void dictarClase() {
        System.out.println(nombre + " está dictando la clase de " + materia + ".");
    }

    public void calificar(double nota) {
        System.out.println(nombre + " calificó la actividad con una nota de: " + nota);
    }

    public static void main(String[] args) {
        Docente docente1 = new Docente("Carlos Gómez", "Matemáticas", 5);
        docente1.mostrarInfo();
        docente1.dictarClase();
        docente1.calificar(4.5);

        System.out.println();

        Docente docente2 = new Docente("María Pérez", "Programación", 8);
        docente2.mostrarInfo();
        docente2.dictarClase();
        docente2.calificar(5.0);
    }
}
