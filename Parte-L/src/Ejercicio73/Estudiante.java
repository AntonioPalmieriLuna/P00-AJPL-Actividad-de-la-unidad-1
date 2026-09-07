package Ejercicio73;

public class Estudiante {

    private String nombre;
    private Long codigo;
    private int semestre;

    public Estudiante(String nombre,Long codigo,int semestre){
        this.nombre=nombre;
        this.codigo=codigo;
        this.semestre=semestre;
    }

    public Estudiante(Estudiante estudiante){
        this.nombre=estudiante.nombre;
        this.codigo=estudiante.codigo;
        this.semestre=estudiante.semestre;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre+"\n" +
                "Código: "+codigo+"\n" +
                "Semestre: "+semestre+"\n");
    }


    public static void main(String[]args){
        Estudiante estudiante_prueba=new Estudiante("Juan",7542610769L,2);
        estudiante_prueba.mostrarInfo();

        //copia
        Estudiante estudiante_copia=new Estudiante(estudiante_prueba);
        estudiante_copia.mostrarInfo();
    }
}
