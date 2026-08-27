package Ejercicio24;

public class Libro {

    private String titulo,autor;
    private int numPaginas;

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
        Libro libro1=new Libro("Don Quijote de la Mancha","Miguel de Cervantes",863);
        libro1.mostrarLibro();
    }
}
