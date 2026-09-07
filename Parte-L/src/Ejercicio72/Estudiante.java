package Ejercicio72;

public class Estudiante {
    private String nombre;
    private Long codigo;
    private int semestre;

    public Estudiante(String nombre,Long codigo,int semestre){
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
        Estudiante estudiante_prueba=new Estudiante("Pedro",5442610769L,5);
        estudiante_prueba.mostrarInfo();
    }
}
