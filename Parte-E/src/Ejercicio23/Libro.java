package Ejercicio23;

public class Libro {

    private String titulo,autor;
    private int numPaginas;

    // Constructor vacío (por defecto)
    public Libro(){
        this.titulo="Cien años de soledad";
        this.autor="Gabriel García Márquez";
        this.numPaginas=471;
    }

    public void mostrarLibro(){
        System.out.println("Título: "+titulo+"\n" +
                "Autor: "+autor+"\n" +
                "Número de páginas: "+numPaginas+"\n");
    }

    public static void main(String[]args){
        Libro libro1=new Libro();
        libro1.mostrarLibro();
    }
}
