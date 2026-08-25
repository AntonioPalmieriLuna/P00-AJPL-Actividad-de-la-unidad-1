package Ejercicio6;

public class Estudiante {
    private String nombre;
    private int edad,curso;

    public Estudiante(String nombre, int edad, int curso){
        this.nombre=nombre;
        this.edad=edad;
        this.curso=curso;
    }

    public void mostrarEstudiante(){
        System.out.println("Nombre: "+nombre+"\n" +
                "Edad: "+edad+"\n" +
                "Curso: "+curso);
    }

    public static void main(String[]args){
        Estudiante estudiante_prueba=new Estudiante("Alfredo",19,3);
        estudiante_prueba.mostrarEstudiante();
    }
}
