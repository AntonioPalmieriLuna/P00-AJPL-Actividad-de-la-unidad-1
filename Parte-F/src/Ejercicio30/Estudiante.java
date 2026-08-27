package Ejercicio30;

public class Estudiante {

    private String nombre;
    private Long codigo;
    private int semestre;

    // Constructor vacío
    public Estudiante(){
        this.nombre="Antonio";
        this.codigo=7502610009L;
        this.semestre=2;
    }

    // Constructor con nombre y código
    public Estudiante(String nombre, Long codigo){
        this.nombre=nombre;
        this.codigo=codigo;
    }

    // Constructor con nombre, código y semestre
    public Estudiante(String nombre, Long codigo, int semestre){
        this.nombre=nombre;
        this.codigo=codigo;
        this.semestre=semestre;
    }

    public void mostrarEstudiante(){
        System.out.println("Nombre: "+nombre+"\n" +
                "Código: "+codigo+"\n" +
                "Semestre: "+semestre+"\n");
    }

    public static void main(String[]args){
        Estudiante est1=new Estudiante();
        Estudiante est2=new Estudiante("Alfredo",7502610010L);
        Estudiante est3=new Estudiante("Carlos",7502610011L,6);

        est1.mostrarEstudiante();
        est2.mostrarEstudiante();
        est3.mostrarEstudiante();
    }
}
