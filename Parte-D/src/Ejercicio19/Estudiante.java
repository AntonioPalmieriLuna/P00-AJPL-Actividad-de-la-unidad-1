package Ejercicio19;

// EXPLICACIÓN - CLASE VS OBJETO:

// 'Estudiante' es una clase porque actúa como la plantilla, molde o definición conceptual.
//Define qué atributos (nombre, código, semestre) y qué comportamientos tendrán
// todos los estudiantes que se creen a partir de ella, sin representar
// a un individuo específico.

// 'est1' es un objeto (instancia) porque es una entidad concreta y real creada en memoria
//  a partir de la clase Estudiante. Posee una identidad propia y almacena valores específicos
// o en sus atributos para ese caso particular.

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
                "Semestre: "+semestre);
    }

    public static void main(String[]args){
        // 'Estudiante' es la clase (plantilla) y 'est1' es el objeto (instancia concreta en memoria)
        Estudiante est1=new Estudiante("Antonio",7502610009L,2);
        est1.mostrarInfo();
    }
}
