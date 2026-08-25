package Ejercicio10;

public class CuentaBancaria {
    private long numero;
    private String titular;
    private int saldo;

    public CuentaBancaria(long numero, String titular, int saldo){
        this.numero=numero;
        this.titular=titular;
        this.saldo=saldo;
    }

    public void mostrarCuenta(){
        System.out.println("Titular: "+titular+"\n" +
                "Número de cuenta: "+numero+"\n" +
                "Saldo: "+saldo);
    }

    public static void main(String[]args){
        CuentaBancaria cuenta1=new CuentaBancaria(12345678998655L,"Stiven",45000);
        CuentaBancaria cuenta2=new CuentaBancaria(98765432112345L,"Antonio",120000);

        cuenta1.mostrarCuenta();
        System.out.println();
        cuenta2.mostrarCuenta();
    }
}
