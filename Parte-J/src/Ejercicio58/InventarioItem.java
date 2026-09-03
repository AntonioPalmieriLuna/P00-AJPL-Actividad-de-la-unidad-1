package Ejercicio58;

public class InventarioItem {
    private String nombre;
    private int cantidad;
    private float precioUnitario;

    public InventarioItem(String nombre, int cantidad, float precioUnitario){
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public  float valorInventario(){
        return cantidad * precioUnitario;
    }

    public void mostrarInventario(){
        System.out.println("Nombre: "+nombre+"\n"
        + "Cantidad: "+cantidad+"\n"
        + "Precio Unitario: "+precioUnitario+"\n"
        + "Valor de Inventario: "+valorInventario()+"\n");
    }

    public static void main(String[] args) {
        InventarioItem item = new InventarioItem("Lava-Losa", 10, 5.5f);
        item.mostrarInventario();

        InventarioItem item2 = new InventarioItem("Tijera", 4, 12.0f);
        item2.mostrarInventario();
    }
}
