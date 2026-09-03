package Ejercicio52;

public class FacturaSimple {
    private int numero;
    private String cliente;
    private float valor;

    public FacturaSimple(int numero, String cliente, float valor) {
        this.numero = numero;
        this.cliente = cliente;
        this.valor = valor;
    }

    public void aplicarDescuento(){
        valor= valor - (valor*0.10f);
    }

    public void mostrarInformacion(){
        System.out.println("Numero: "+numero+"\n"+
                "Cliente: "+cliente+"\n"+
                        "Valor: "+valor+"\n");
    }

    public static void main(String[]args){
        FacturaSimple factura=new FacturaSimple(1,"Juan",10000);
        factura.aplicarDescuento();
        factura.mostrarInformacion();

        FacturaSimple factura2=new FacturaSimple(2,"Pedro",20000);
        factura2.aplicarDescuento();
        factura2.mostrarInformacion();
    }
}
