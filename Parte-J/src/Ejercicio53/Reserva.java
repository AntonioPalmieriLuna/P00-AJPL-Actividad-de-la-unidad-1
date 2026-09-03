package Ejercicio53;

public class Reserva {
    private String nombreCliente;
    private String fecha;
    private boolean activa;

    public Reserva(String nombreCliente, String fecha, boolean activa) {
        this.nombreCliente = nombreCliente;
        this.fecha = fecha;
        this.activa = activa;
    }

    public void confirmar(){
        activa = true;
    }
    public void cancelar(){
        activa = false;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre del cliente: "+nombreCliente+"\n"+
                "Fecha: "+fecha+"\n"+
                "Estado de reserva: "+activa+"\n");
    }

    public static void main(String[] args) {

        Reserva reserva1 = new Reserva("Juan García", "2023-09-15", true);
        reserva1.mostrarInformacion();
        reserva1.cancelar();
        reserva1.mostrarInformacion();
        reserva1.confirmar();
        reserva1.mostrarInformacion();

    }
}
