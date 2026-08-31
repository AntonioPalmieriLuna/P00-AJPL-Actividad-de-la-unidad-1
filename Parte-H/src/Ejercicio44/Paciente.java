package Ejercicio44;

public class Paciente {
    private String nombre,documento,diagnostico;
    private int edad;

    public Paciente(String nombre, String documento, String diagnostico, int edad){
        this.nombre=nombre;
        this.documento=documento;
        this.diagnostico=diagnostico;
        this.edad=edad;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre+"\n" +
                "Documento: "+documento+"\n" +
                "Diagnóstico: "+diagnostico+"\n" +
                "Edad: "+edad+"\n");
    }

    public static void main(String[] args) {
        Paciente paciente1=new Paciente("Carlos Gómez", "10452389", "Gripe común", 34);
        paciente1.mostrarInfo();

        Paciente paciente2=new Paciente("María Torres", "10987654", "Hipertensión", 52);
        paciente2.mostrarInfo();
    }

    /*
    La diferencia radica en el nivel de lenguaje y enfoque conceptual que se utiliza al hablar del problema.
    "Crear un paciente" es una expresión del dominio del problema (el mundo real o el contexto médico), enfocada en el aspecto conceptual:
    significa representar a una persona real con sus datos de salud dentro del sistema que estamos modelando.

    Por otro lado, "instanciar la clase Paciente" es un término técnico de la programación orientada a objetos:
    hace referencia a la acción formal del lenguaje (usar el operador 'new') para reservar un espacio específico en la memoria RAM del equipo
    y construir el objeto a partir de la clase.

    "Crear un paciente" es el QUÉ estamos haciendo a nivel de lógica de negocio, mientras que "instanciar la clase" es el CÓMO lo realiza el computador a nivel técnico.
     */
}