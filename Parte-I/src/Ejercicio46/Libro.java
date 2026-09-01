package Ejercicio46;

public class Libro {

    private String titulo;
    private String autor;
    private int paginas;

    // 3. CÓDIGO CORREGIDO:
    // Se define la clase con su nombre identificador 'Libro' tras la palabra reservada 'class'.
    public Libro(String titulo, String autor, int paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void mostrarInfo(){
        System.out.println("Título: " + titulo + "\n" +
                "Autor: " + autor + "\n" +
                "Páginas: " + paginas + "\n");
    }

    public static void main(String[] args){
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 417);
        libro1.mostrarInfo();
    }
}

/*
 1. CÓDIGO ERRADO (Evidencia):
 package Ejercicio46;

 // ERROR: Falta el nombre (identificador) de la clase después de 'public class'
 public class {

     private String titulo;
     private String autor;
     private int paginas;

     public Libro(String titulo, String autor, int paginas){
         this.titulo = titulo;
         this.autor = autor;
         this.paginas = paginas;
     }

     public void mostrarInfo(){
         System.out.println("Título: " + titulo + "\n" +
                 "Autor: " + autor + "\n" +
                 "Páginas: " + paginas + "\n");
     }

     public static void main(String[] args){
         Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 417);
         libro1.mostrarInfo();
     }
 }

 2. EXPLICACIÓN DEL MENSAJE DE ERROR DEL COMPILADOR:
 Al compilar una clase que no tiene nombre después de la palabra clave 'class', el compilador genera:

 - Error: "<identifier> expected"
   Explicación: En la gramática de Java, la declaración de una clase requiere la estructura:
   '[modificador] class <NombreDeLaClase> { ... }'.
   Si se omite el nombre, el compilador encuentra la llave de apertura '{' donde esperaba
   un identificador (el nombre del tipo de dato) y detiene la compilación marcando el error de sintaxis.

 - Además, el archivo fuente .java no puede coincidir con ninguna clase pública declarada en él,
   generando errores adicionales relacionados con la estructura del archivo y el constructor.

 3. CORRECCIÓN DEL ERROR:
 Se agregó el identificador 'Libro' inmediatamente después de 'public class'. De este modo,
 la clase queda nombrada correctamente ('public class Libro'), coincide con el nombre del archivo
 'Libro.java' y permite la correcta declaración de constructores e instanciación de objetos.
*/
