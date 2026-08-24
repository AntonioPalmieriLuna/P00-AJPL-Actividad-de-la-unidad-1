package Ejercicio3;

import java.net.PortUnreachableException;

public class Producto {
    private String nombre;
    private int precio,stock;

    public Producto(){
        this.nombre="Limpia Baños";
        this.precio=10000;
        this.stock=60;
    }

    public void mostrarProducto(){
        System.out.println("Nombre: "+nombre+"\n" +
                "Precio: "+precio+"\n" +
                "Stock: "+stock);
    }

    public static void main(String[]args){
        Producto producto_prueba=new Producto();
        producto_prueba.mostrarProducto();
    }
}
