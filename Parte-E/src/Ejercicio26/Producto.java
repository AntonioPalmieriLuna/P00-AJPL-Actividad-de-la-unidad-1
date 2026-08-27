package Ejercicio26;

public class Producto {

    private String nombre;
    private int precio,stock;

    // Constructor vacío
    public Producto(){
        this.nombre="Limpia Baños";
        this.precio=10000;
        this.stock=60;
    }

    // Constructor con parámetros
    public Producto(String nombre, int precio, int stock){
        this.nombre=nombre;
        this.precio=precio;
        this.stock=stock;
    }

    public void mostrarProducto(){
        System.out.println("Nombre: "+nombre+"\n" +
                "Precio: "+precio+"\n" +
                "Stock: "+stock+"\n");
    }

    public static void main(String[]args){
        Producto producto1=new Producto();
        Producto producto2=new Producto("Detergente",15000,40);

        producto1.mostrarProducto();
        producto2.mostrarProducto();
    }
}
