package Ejercicio68;

public class Negocio {
    private String nombre,direccion,dueño,producto;
    private int telefono,stock,empleados;

    public Negocio(String nombre, String direccion, String dueño, String producto, int telefono, int stock, int empleados) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.dueño = dueño;
        this.producto = producto;
        this.telefono = telefono;
        this.stock = stock;
        this.empleados = empleados;
    }

    public void mostraInformacion(){
        System.out.println("Nombre: "+nombre+"\n"+
                "Direccion: "+direccion+"\n"+
                "Dueño: "+dueño+"\n"+
                "Producto: "+producto+"\n"+
                "Telefono: "+telefono+"\n"+
                "Stock: "+stock+"\n"+
                "Empleados: "+empleados+"\n");
    }

    public static void main(String[] args){
        Negocio negocio = new Negocio("Nutresa","Mzn 3 Lt23","Gilinski","Saltín Noel",123456789,1000,100);
        negocio.mostraInformacion();
    }
}
