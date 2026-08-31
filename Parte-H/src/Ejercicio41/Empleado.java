package Ejercicio41;

public class Empleado {
    private String nombre,empresa,cargo;
    private int edad;

    public Empleado(String nombre, String empresa, String cargo, int edad){
        this.nombre=nombre;
        this.empresa=empresa;
        this.cargo=cargo;
        this.edad=edad;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre+"\n" +
                "Empresa: "+empresa+"\n" +
                "Cargo: "+cargo+"\n" +
                "Edad: "+edad+"\n");
    }

    public static void main(String[] args) {
        Empleado empleado1=new Empleado("Juan", "Empresa A", "Desarrollador", 25);
        empleado1.mostrarInfo();

        Empleado empleado2=new Empleado("Pedro", "Empresa A", "Analista", 30);
        empleado2.mostrarInfo();
    }

    /*
    Modelar el Empleado con una clase es mucho mejor porque nos permite juntar todos sus datos y sus acciones en un solo lugar.
    Si usáramos programación estructurada con variables sueltas (como nombre1, edad1, nombre2, edad2)
    el código se volvería un caos imposible de ordenar al meter más empleados, y sería muy fácil cruzar los datos por error.
    Con objetos, el código queda limpio y ordenado:
    cada empleado es un bloque independiente, lo que hace que el programa sea mucho más fácil de entender, mantener
    y ampliar si el profesor nos pide agregar más funciones después.
     */
}
