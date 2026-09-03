package Ejercicio55;

public class Reloj {
    private int hora;
    private int minuto;
    private int segundo;

    public Reloj(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void mostrarHora(){
        System.out.println("Hora: "+hora+":"+minuto+":"+segundo);
    }

    public static void main(String[] args) {
        Reloj reloj = new Reloj(12, 30, 45);
        reloj.mostrarHora();

        Reloj reloj2 = new Reloj(7, 45, 20);
        reloj2.mostrarHora();
    }
}
