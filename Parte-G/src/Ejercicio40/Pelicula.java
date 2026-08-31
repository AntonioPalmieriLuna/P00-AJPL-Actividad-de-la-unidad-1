package Ejercicio40;

public class Pelicula {
    private String nombre, genero;
    private int minutos;

    public Pelicula() {
        nombre = "La casa de papel";
        genero = "Drama";
        minutos = 120;
    }

    public void mostrarFicha() {
        System.out.println("Nombre: " + nombre + "\n" +
                "Genero: " + genero + "\n" +
                "Minutos: " + minutos + "\n");
    }

    public static void main(String[] args) {
        Pelicula pelicula_prueba=new Pelicula();
        pelicula_prueba.mostrarFicha();
    }
}
