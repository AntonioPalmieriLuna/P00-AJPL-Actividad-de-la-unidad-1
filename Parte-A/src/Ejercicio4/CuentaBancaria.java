package Ejercicio4;

public class CuentaBancaria {

    private long numero;
    private String titular;
    private int saldo;

    public CuentaBancaria(){
        this.numero=12345678998655L;
        this.titular="Stiven";
        this.saldo=45000;
    }
    public void mostrarCuenta(){
        System.out.println("Titular: "+titular+"\n" +
                "Número de cuenta: "+numero+"\n" +
                "Saldo: "+saldo);
    }

    public static void main(String[]args){
        CuentaBancaria cuenta_bancaria_prueba=new CuentaBancaria();
        cuenta_bancaria_prueba.mostrarCuenta();
    }
}
