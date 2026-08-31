package Ejercicio42;

public class Curso {
    private String nombre,codigo;

    public Curso(String nombre, String codigo){
        this.nombre=nombre;
        this.codigo=codigo;
    }

    public void mostrarInfo(){
        System.out.println("Nombre del curso: "+nombre+"\n" +
                "Código: "+codigo+"\n");
    }

    public static void main(String[] args) {
        Curso curso1=new Curso("Cálculo Integral", "MAT-305");
        curso1.mostrarInfo();

        Curso curso2=new Curso("Programación Básica", "INF-202");
        curso2.mostrarInfo();
    }

    /*
    Ambos objetos pertenecen a la misma clase Curso porque fueron creados utilizando el mismo molde original.
    La clase define la estructura general (los atributos, nombre y codigo) y los comportamientos (el metodo mostrarInfo)
    que todos los cursos deben tener de forma obligatoria.
    Aunque curso1 y curso2 guardan información totalmente distinta en su memoria interna, ambos responden a las mismas
    reglas y tienen la misma forma, del mismo modo que dos formularios idénticos siguen siendo el mismo tipo de documento
    aunque se llenen con los datos de personas diferentes.
     */
}