package Ejercicio28;

public class CuentaBancaria {

    private long numero;
    private String titular;
    private int saldo;

    // Constructor con numero, titular y saldo inicial
    public CuentaBancaria(long numero, String titular, int saldoInicial){
        this.numero=numero;
        this.titular=titular;
        this.saldo=saldoInicial;
    }

    public void mostrarCuenta(){
        System.out.println("Titular: "+titular+"\n" +
                "Número de cuenta: "+numero+"\n" +
                "Saldo: "+saldo+"\n");
    }

    public static void main(String[]args){
        CuentaBancaria cuenta1=new CuentaBancaria(12345678998655L,"Stiven",45000);
        CuentaBancaria cuenta2=new CuentaBancaria(98765432112345L,"Antonio",120000);
        CuentaBancaria cuenta3=new CuentaBancaria(45678912345678L,"Mariana",350000);

        cuenta1.mostrarCuenta();
        cuenta2.mostrarCuenta();
        cuenta3.mostrarCuenta();
    }
}
