package Ejercicio62;

/*
Diseño de la clase Biblioteca antes de programar:

Atributos que tendrá:
- nombre: String (nombre de la biblioteca)
- direccion: String (ubicación física)
- totalLibros: int (cantidad de libros disponibles para préstamo)

Métodos que tendrá:
- mostrarInfo(): muestra la información de la biblioteca
- prestarLibros(int cantidad): descuenta libros disponibles si hay suficientes
- devolverLibros(int cantidad): suma libros devueltos al inventario

Objetos reales que se podrían construir:
- Biblioteca 1: "Biblioteca Bartolomé Calvo", "Centro Histórico", 3500 libros
- Biblioteca 2: "Biblioteca Municipal", "Calle 30", 1200 libros
*/

public class Biblioteca {
    private String nombre;
    private String direccion;
    private int totalLibros;

    public Biblioteca(String nombre, String direccion, int totalLibros) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.totalLibros = totalLibros;
    }

    public void prestarLibros(int cantidad) {
        if (cantidad <= totalLibros) {
            totalLibros -= cantidad;
            System.out.println("Se prestaron " + cantidad + " libros. Quedan disponibles: " + totalLibros);
        } else {
            System.out.println("No hay suficientes libros disponibles para prestar " + cantidad + ".");
        }
    }

    public void devolverLibros(int cantidad) {
        totalLibros += cantidad;
        System.out.println("Se devolvieron " + cantidad + " libros. Total disponible: " + totalLibros);
    }

    public void mostrarInfo() {
        System.out.println("Biblioteca: " + nombre + "\n" +
                "Dirección: " + direccion + "\n" +
                "Total libros disponibles: " + totalLibros + "\n");
    }

    public static void main(String[] args) {
        Biblioteca biblio1 = new Biblioteca("Biblioteca Bartolomé Calvo", "Centro Histórico", 3500);
        biblio1.mostrarInfo();
        biblio1.prestarLibros(150);
        biblio1.devolverLibros(50);
        biblio1.mostrarInfo();

        Biblioteca biblio2 = new Biblioteca("Biblioteca Municipal", "Calle 30", 1200);
        biblio2.mostrarInfo();
        biblio2.prestarLibros(1300);
    }
}
