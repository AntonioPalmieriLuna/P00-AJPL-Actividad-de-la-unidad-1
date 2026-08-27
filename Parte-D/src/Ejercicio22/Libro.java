package Ejercicio22;

public class Libro {

    private String titulo,autor;
    private int numPaginas;

    public Libro(String titulo, String autor, int numPaginas){
        this.titulo=titulo;
        this.autor=autor;
        this.numPaginas=numPaginas;
    }

    public void mostrarInfo(){
        System.out.println("Título: "+titulo+"\n" +
                "Autor: "+autor+"\n" +
                "Número de páginas: "+numPaginas+"\n");
    }

    public static void main(String[]args){
        Libro libro1=new Libro("Cien años de soledad","Gabriel García Márquez",471);
        Libro libro2=new Libro("Don Quijote de la Mancha","Miguel de Cervantes",863);
        Libro libro3=new Libro("El señor de los anillos","J.R.R. Tolkien",1216);
        Libro libro4=new Libro("El principito","Antoine de Saint-Exupéry",96);

        System.out.println(" Libro 1 ");
        libro1.mostrarInfo();

        System.out.println(" Libro 2 ");
        libro2.mostrarInfo();

        System.out.println(" Libro 3 ");
        libro3.mostrarInfo();

        System.out.println(" Libro 4 ");
        libro4.mostrarInfo();
    }

    /*
     * CONCLUSIÓN:
     *
     * La clase 'Libro' es una plantilla (o molde) porque define la estructura general y los atributos
     * comunes (titulo, autor, numPaginas) y comportamientos que caracterizan a los libros,
     * sin representar un libro específico ni contener datos particulares.
     *
     * Por otro lado, los cuatro objetos ('libro1', 'libro2', 'libro3' y 'libro4') son casos concretos (instancias)
     * porque son representaciones reales en memoria de libros individuales con datos e identidad propios.
     */

}
