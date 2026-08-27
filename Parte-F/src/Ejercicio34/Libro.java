package Ejercicio34;

public class Libro {

    private String titulo,autor;
    private int numPaginas;

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

    public Libro(Libro libro){
        this.titulo=libro.titulo;
        this.autor=libro.autor;
        this.numPaginas=libro.numPaginas;
    }

    public static void main(String[]args){
        Libro libro_original=new Libro();
        libro_original.mostrarLibro();

        Libro librolibro_copia=new Libro(libro_original);
        librolibro_copia.mostrarLibro();
    }
}
