package Ejercicio49;

public class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + "\n" +
                "Edad: " + edad + "\n");
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Antonio", 20);
        Persona persona2 = new Persona("Carlos", 25);

        // 3. CÓDIGO CORREGIDO:
        // Se accede a la información de persona2 a través de su propia referencia y metodo.
        persona1.mostrarInfo();
        persona2.mostrarInfo();
    }
}

/*
 1. CÓDIGO ERRADO (Evidencia):
 package Ejercicio49;

 public class Persona {
     private String nombre;
     private int edad;

     public Persona(String nombre, int edad) {
         this.nombre = nombre;
         this.edad = edad;
     }

     public void transferirOAcceder() {
         // ERROR: Se intenta acceder a los atributos de otro objeto sin tener una referencia a él
         System.out.println(otroObjeto.nombre); // 'otroObjeto' no existe en este ámbito
     }

     public static void main(String[] args) {
         Persona persona1 = new Persona("Antonio", 20);
         Persona persona2 = new Persona("Carlos", 25);
         // ERROR: Intentar acceder a atributos privados de persona2 directamente desde fuera o sin referencia
         System.out.println(persona2.nombre); // nombre tiene acceso privado en Persona
     }
 }

 2. EXPLICACIÓN DEL MENSAJE DE ERROR DEL COMPILADOR:
 - Error: "cannot find symbol"
   Explicación: Ocurre cuando un objeto intenta usar atributos o métodos de otro objeto sin recibir su referencia como
   parámetro o sin tener una variable declarada que apunte a dicho objeto.

 - Error: "nombre has private access in Persona"
   Explicación: Si se intenta acceder directamente a un atributo privado de otro objeto sin usar métodos de acceso
   (getters) o métodos de la clase, el compilador bloquea el acceso por encapsulamiento.

 3. CORRECCIÓN DEL ERROR:
 Para interactuar con otro objeto o acceder a su información, se debe contar con una referencia válida hacia dicho
 objeto (ya sea pasándolo como parámetro a un metodo o llamando a sus métodos públicos desde donde se tiene la referencia).
*/
