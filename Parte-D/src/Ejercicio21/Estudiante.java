package Ejercicio21;

/*
 * EJEMPLO DE ATRIBUTO COMPARTIDO:
 *
 * Los objetos 'est1' y 'est2' tienen el mismo valor en el atributo 'semestre' (semestre = 3),
 * pero tienen valores diferentes en todos los demás atributos ('nombre' y 'codigo').
 * Esto demuestra que diferentes objetos pueden compartir valores en ciertos atributos sin perder su identidad individual.
 */

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
        // Mismo valor en 'semestre' (3), distinto valor en 'nombre' y 'codigo'
        Estudiante est1=new Estudiante("Antonio",7502610009L,3);
        Estudiante est2=new Estudiante("Mariana",7502610015L,3);

        System.out.println("--- Estudiante 1 ---");
        est1.mostrarInfo();

        System.out.println("--- Estudiante 2 ---");
        est2.mostrarInfo();
    }
}
