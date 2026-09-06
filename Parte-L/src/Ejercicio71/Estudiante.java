package Ejercicio71;

/*
Reescritura del Ejercicio 1 (Parte-A):
Originalmente la clase Estudiante inicializaba sus atributos de forma fija dentro de un constructor sin parámetros:
    this.nombre = "Antonio";
    this.codigo = 7502610009L;
    this.semestre = 2;

En esta versión reescrita se implementa un constructor con parámetros, lo que permite crear cualquier
instancia de Estudiante pasando sus datos específicos al momento de la creación, maximizando la
reutilización y flexibilidad del código.
*/

public class Estudiante {

    private String nombre;
    private long codigo;
    private int semestre;

    // Constructor con parámetros
    public Estudiante(String nombre, long codigo, int semestre) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + "\n" +
                "Código: " + codigo + "\n" +
                "Semestre: " + semestre + "\n");
    }

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Antonio Palmieri", 7502610009L, 5);
        estudiante1.mostrarInfo();

        Estudiante estudiante2 = new Estudiante("Camila Rivas", 7502610045L, 4);
        estudiante2.mostrarInfo();
    }
}
