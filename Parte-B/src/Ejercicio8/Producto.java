package Ejercicio8;

public class Producto {
    private String nombre;
    private int precio,stock;

    public Producto(String nombre, int precio, int stock){
        this.nombre=nombre;
        this.precio=precio;
        this.stock=stock;
    }

    public void mostrarProducto(){
        System.out.println("Nombre: "+nombre+"\n" +
                "Precio: "+precio+"\n" +
                "Stock: "+stock);
    }

    public static void main(String[]args){
        Producto producto1=new Producto("Limpia Espejos",13000,10);
        Producto producto2=new Producto("Detergente",15000,40);
        Producto producto3=new Producto("Jabón",3000,100);

        producto1.mostrarProducto();
        System.out.println();
        producto2.mostrarProducto();
        System.out.println();
        producto3.mostrarProducto();
    }
}
