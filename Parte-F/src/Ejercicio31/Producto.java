package Ejercicio31;

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
        Producto producto_prueba=new Producto();
        producto_prueba.mostrarProducto();

        System.out.println("Producto básico");
        Producto producto_basico=Producto.crearProductoBasico("Detergente");
        producto_basico.mostrarProducto();
    }
}
