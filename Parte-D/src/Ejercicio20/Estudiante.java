package Ejercicio20;

public class Estudiante {

    private String nombre;
    private Long codigo;
    private int semestre;

    public Estudiante(String nombre, Long codigo, int semestre){
        this.nombre=nombre;
        this.codigo=codigo;
        this.semestre=semestre;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre+"\n" +
                "Código: "+codigo+"\n" +
                "Semestre: "+semestre+"\n");
    }

    public static void main(String[]args){
        Estudiante est1=new Estudiante("Antonio",7502610009L,2);
        Estudiante est2=new Estudiante("Alfredo",7502610010L,4);
        Estudiante est3=new Estudiante("Carlos",7502610011L,6);

        System.out.println("Estudiante 1");
        est1.mostrarInfo();


        System.out.println("Estudiante 2");
        est2.mostrarInfo();

        System.out.println("Estudiante 3");
        est3.mostrarInfo();
    }

    /*
     * EXPLICACIÓN:
     *
     * ¿qué comparten los tres objetos?
     * 1. Comparten la misma estructura de datos (los mismos atributos: nombre, código y semestre).
     * 2. Comparten los mismos métodos y comportamientos definidosen la clase Estudiante (como mostrarInfo()).
     * 3. Comparten el mismo tipo de dato (todos son instancias de la clase Estudiante).
     *
     * ¿en qué se diferencian?
     * 1. Se diferencian en su estado: cada objeto almacena valores específicos
     * y propios en sus atributos.
     * 2. Se diferencian en su identidad: cada objeto tiene su propia referencia
     * y espacio independiente en memoria.
     */

}
