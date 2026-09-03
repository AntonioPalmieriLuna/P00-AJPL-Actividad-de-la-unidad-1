package Ejercicio54;

public class Semaforo {
    private String color;

    public Semaforo(String color){
        this.color = color;
    }

    public void cambiarRojo(){
        color="Rojo";
    }

    public void cambiarAmarillo(){
        color="Amarillo";
    }

    public void cambiarVerde(){
        color="Verde";
    }

    public void mostrarColor(){
        System.out.println("Color del semáforo: "+color);
    }

    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo("Rojo");
        semaforo.mostrarColor();

        semaforo.cambiarAmarillo();
        semaforo.mostrarColor();

        semaforo.cambiarVerde();
        semaforo.mostrarColor();
    }
}
