package Ejercicio48;

public class Producto {

    private String nombre;
    private double precio;

    // 3. CÓDIGO CORREGIDO:
    // Se utiliza 'this.nombre' y 'this.precio' para asignar los parámetros recibidos a los atributos de la instancia.
    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarInfo(){
        System.out.println("Producto: " + nombre + "\n" +
                "Precio: " + precio + "\n");
    }

    public static void main(String[] args){
        Producto producto1 = new Producto("Portátil Asus", 2500000.0);
        producto1.mostrarInfo();
    }
}

/*
 1. CÓDIGO ERRADO (Evidencia):
 package Ejercicio48;

 public class Producto {

     private String nombre;
     private double precio;

     public Producto(String nombre, double precio){
         // ERROR: Se redeclaran como variables locales anteponiendo el tipo ('String', 'double')
         // o se asignan 'nombre = nombre' confundiendo el parámetro/variable local con el atributo de la clase.
         String nombre = nombre; 
         double precio = precio;
     }

     public void mostrarInfo(){
         System.out.println("Producto: " + nombre + "\n" +
                 "Precio: " + precio + "\n");
     }

     public static void main(String[] args){
         Producto producto1 = new Producto("Portátil Asus", 2500000.0);
         producto1.mostrarInfo();
     }
 }

 2. EXPLICACIÓN DEL MENSAJE DE ERROR DEL COMPILADOR / COMPORTAMIENTO:
 Al intentar compilar y ejecutar este código, se presentan los siguientes problemas:

 - Error del compilador: "variable nombre is already defined in constructor Producto(java.lang.String,double)"
   Explicación: El compilador no permite redeclarar 'String nombre' dentro del constructor porque 'nombre'
   ya fue declarado como parámetro en la firma del metodo constructor.

 - Error lógico de ámbito (Shadowing / Variables Locales vs Atributos):
   Incluso si no se coloca el tipo y se escribe 'nombre = nombre;' sin la palabra clave 'this',
   Java le da prioridad a la variable local/parámetro más cercana. Por tanto, el parámetro se asigna
   a sí mismo y los atributos del objeto ('this.nombre' y 'this.precio') nunca se inicializan,
   quedando con sus valores por defecto ('null' y '0.0'). Las variables locales mueren al terminar
   la ejecución del constructor y el objeto queda vacío.

 3. CORRECCIÓN DEL ERROR:
 Se eliminó la redeclaración de tipo y se utilizó la referencia explícita 'this':
 'this.nombre = nombre;' y 'this.precio = precio;'.
 La palabra reservada 'this' le indica a Java que estamos accediendo a los atributos del objeto
 que se está creando, diferenciándolos claramente de los parámetros o variables locales del método.
*/
