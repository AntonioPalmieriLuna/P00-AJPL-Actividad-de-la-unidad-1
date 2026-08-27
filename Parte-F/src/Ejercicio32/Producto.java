package Ejercicio32;

public class Producto {
    private String nombre;
    private int precio,stock;

    public Producto(){
        this.nombre="Limpia Baños";
        this.precio=10000;
        this.stock=60;
    }

    public Producto(String nombre, int precio, int stock){
        this.nombre=nombre;
        this.precio=precio;
        this.stock=stock;
    }

    public static Producto crearProductoBasico(String nombre){
        return new Producto(nombre,2000,1);
    }

    public void mostrarProducto(){
        System.out.println("Nombre: "+nombre+"\n" +
                "Precio: "+precio+"\n" +
                "Stock: "+stock+"\n");
    }

    public static void main(String[]args){
        System.out.println("Producto básico 1");

        Producto producto_basico=Producto.crearProductoBasico("FAB");
        producto_basico.mostrarProducto();

        System.out.println("Producto básico 2");

        Producto producto_basico2=Producto.crearProductoBasico("Desodorante");
        producto_basico2.mostrarProducto();

    }
}
