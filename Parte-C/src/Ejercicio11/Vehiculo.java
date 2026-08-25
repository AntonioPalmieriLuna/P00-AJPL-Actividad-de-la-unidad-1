package Ejercicio11;

public class Vehiculo {
    private String marca,modelo;
    private int velocidadActual;

    public Vehiculo(String marca, String modelo, int velocidadActual){
        this.marca=marca;
        this.modelo=modelo;
        this.velocidadActual=velocidadActual;
    }

    public void acelerar(){
        velocidadActual+=10;
    }

    public void mostrarEstado(){
        System.out.println("Marca: "+marca+"\n" +
                "Modelo: "+modelo+"\n" +
                "Velocidad Actual: "+velocidadActual);
    }

    public static void main(String[]args){
        Vehiculo vehiculo=new Vehiculo("Mazda","Cx-30",0);
        // antes de acelerar
        vehiculo.mostrarEstado();

        System.out.println();

        // despues
        vehiculo.acelerar();
        vehiculo.mostrarEstado();
    }
}
