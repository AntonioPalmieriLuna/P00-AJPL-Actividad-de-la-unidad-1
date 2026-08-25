package Ejercicio17;

public class Estudiante {

    private String nombre;
    private Long codigo;
    private int semestre;

    public Estudiante(){
        this.nombre="Antonio";
        this.codigo=7502610009L;
        this.semestre=2;
    }

    public void cambiarSemestre(int semestre){
        this.semestre=semestre;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre+"\n" +
                "Código: "+codigo+"\n" +
                "Semestre: "+semestre+"\n");
    }


    public static void main(String[]args){
        Estudiante estudiante_prueba=new Estudiante();
        estudiante_prueba.mostrarInfo();

        estudiante_prueba.cambiarSemestre(8);

        estudiante_prueba.mostrarInfo();
    }
}
