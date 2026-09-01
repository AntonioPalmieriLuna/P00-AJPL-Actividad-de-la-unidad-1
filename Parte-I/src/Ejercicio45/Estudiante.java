package Ejercicio45;

public class Estudiante {

    private String nombre;
    private int edad;

    public Estudiante(){
        this.nombre="Antonio";
        this.edad=20;
    }

    // 3. CÓDIGO CORREGIDO:
    // El metodo debe estar declarado dentro de las llaves de la clase para ser parte de ella.
    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre+"\n"+
                "Edad: "+edad+"\n");
    }

    public static void main(String[]args){
        Estudiante estudiante1=new Estudiante();
        estudiante1.mostrarInfo();
    }
}

/*
 1. CÓDIGO ERRADO (Evidencia):
 package Ejercicio45;

 public class Estudiante {

     private String nombre;
     private int edad;

     public Estudiante(){
         this.nombre="Antonio";
         this.edad=20;
     }

     public static void main(String[]args){
         Estudiante estudiante1=new Estudiante();
         estudiante1.mostrarInfo();
     }
 }
 // ERROR: El metodo se colocó fuera del cuerpo de la clase (después de la llave de cierre '}')
 public void mostrarInfo(){
     System.out.println("Nombre: "+nombre+"\n"+
             "Edad: "+edad+"\n");
 }

 2. EXPLICACIÓN DEL MENSAJE DE ERROR DEL COMPILADOR:
 Al intentar compilar el código con el metodo fuera de la clase, el compilador genera:
 
- Error: "class, interface, enum, or record expected"
    Explicación: En Java no existen las funciones globales o métodos sueltos.
   Todo metodo debe pertenecer y estar definido dentro del cuerpo de una clase o interfaz (entre sus llaves '{' y '}').
   Cuando el compilador encuentra 'public void mostrarInfo()' fuera de la clase, espera una nueva
   declaración de tipo (como 'class') y no un metodo, por lo que rechaza la sintaxis.

- Además, dentro de la clase Estudiante se produce el error "cannot find symbol: method mostrarInfo()"
   porque el metodo no fue registrado como miembro de la clase, y dentro del metodo suelto los atributos
   'nombre' y 'edad' tampoco son reconocidos porque no están en su ámbito (scope).

 3. CORRECCIÓN DEL ERROR:
Se trasladó la definición completa del metodo 'mostrarInfo()' al interior de la clase 'Estudiante',
antes de la llave de cierre final '}'. De esta manera, el metodo tiene acceso a los atributos
de la instancia y puede ser invocado correctamente desde el metodo 'main'.
*/

