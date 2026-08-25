package Ejercicio16;

public class Producto {
    private String nombre;
    private int precio,stock;

    public Producto(String nombre, int precio, int stock){
        this.nombre=nombre;
        this.precio=precio;
        this.stock=stock;
    }

    public void vender(int cantidad){
        if(cantidad<=stock){
            stock-=cantidad;
        }else{
            System.out.println("No hay stock suficiente para el producto : "+nombre);
        }
    }

    public void reabastecer(int cantidad){
        stock+=cantidad;
    }

    public void mostrarProducto(){
        System.out.println("Nombre: "+nombre+"\n" +
                "Precio: "+precio+"\n" +
                "Stock: "+stock+'\n');
    }

    public static void main(String[]args){
        Producto producto1=new Producto("Limpia Espejos",13000,10);
        Producto producto2=new Producto("Detergente",15000,40);
        Producto producto3=new Producto("Jabón",3000,100);

        producto1.mostrarProducto();
        producto1.vender(5);
        producto1.mostrarProducto();
        producto1.reabastecer(40);
        producto1.mostrarProducto();

        producto2.mostrarProducto();
        producto2.vender(30);
        producto2.mostrarProducto();
        producto2.reabastecer(20);
        producto2.mostrarProducto();

        producto3.mostrarProducto();
        producto3.reabastecer(2);
        producto3.vender(101);
        producto3.mostrarProducto();
    }
}
