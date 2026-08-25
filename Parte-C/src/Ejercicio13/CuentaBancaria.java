package Ejercicio13;

public class CuentaBancaria {
    private long numero;
    private String titular;
    private int saldo;

    public CuentaBancaria(long numero, String titular, int saldo){
        this.numero=numero;
        this.titular=titular;
        this.saldo=saldo;
    }

    public void consignar(double cantidad){
        this.saldo+=cantidad;
    }

    public void mostrarEstado(){
        System.out.println("Número de cuenta: "+numero+"\n" +
                "Titular: "+titular+"\n" +
                "Saldo: "+saldo);
    }

    public static void main(String[]args){
        CuentaBancaria cuenta=new CuentaBancaria(12345678998655L,"Juan Pablo",42000);
        cuenta.mostrarEstado();

        System.out.println();

        //consignar y mostrar nuevo estado
        cuenta.consignar(10000);
        cuenta.mostrarEstado();
    }
}
