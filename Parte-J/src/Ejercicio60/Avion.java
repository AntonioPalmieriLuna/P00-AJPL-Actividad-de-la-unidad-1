package Ejercicio60;

public class Avion {
    private String aerolinea,destino;
    private int pasajeros;

    public Avion(String aerolinea, String destino, int pasajeros) {
        this.aerolinea = aerolinea;
        this.destino = destino;
        this.pasajeros = pasajeros;
    }

    public void abordar(int cantidad){
        pasajeros+=cantidad;
    }

    public void mostrarAvion() {
        System.out.println("Aerolinea: "+aerolinea+"\n"
        + "Destino: "+destino+"\n"
        + "Pasajeros: "+pasajeros+"\n");
    }

    public static void main(String[] args) {
        Avion avion1 = new Avion("Despegar", "Cartagena", 1);
        avion1.mostrarAvion();

        avion1.abordar(100);
        avion1.mostrarAvion();

        avion1.abordar(20);
        avion1.mostrarAvion();



    }
}
