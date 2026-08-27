package Ejercicio25;

public class Libro {

    private String titulo,autor;
    private int numPaginas;

    // Constructor vacío
    public Libro(){
        this.titulo="Cien años de soledad";
        this.autor="Gabriel García Márquez";
        this.numPaginas=471;
    }

    // Constructor con parámetros
    public Libro(String titulo, String autor, int numPaginas){
        this.titulo=titulo;
        this.autor=autor;
        this.numPaginas=numPaginas;
    }

    public void mostrarLibro(){
        System.out.println("Título: "+titulo+"\n" +
                "Autor: "+autor+"\n" +
                "Número de páginas: "+numPaginas+"\n");
    }

    public static void main(String[]args){
        Libro libro1=new Libro();
        Libro libro2=new Libro("El señor de los anillos","J.R.R. Tolkien",1216);

        libro1.mostrarLibro();
        libro2.mostrarLibro();
    }
}
