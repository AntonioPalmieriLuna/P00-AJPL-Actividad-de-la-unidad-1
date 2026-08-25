package Ejercicio7;

public class Vehiculo {
    private String marca,modelo;
    private int velocidadActual;

    public Vehiculo(String marca, String modelo, int velocidadActual){
        this.marca=marca;
        this.modelo=modelo;
        this.velocidadActual=velocidadActual;
    }

    public void mostrarEstado(){
        System.out.println("Marca: "+marca+"\n" +
                "Modelo: "+modelo+"\n" +
                "Velocidad Actual: "+velocidadActual);
    }

    public static void main(String[]args){
        Vehiculo vehiculo1=new Vehiculo("Honda","Sedán",50);
        Vehiculo vehiculo2=new Vehiculo("Toyota","Corolla",70);

        vehiculo1.mostrarEstado();
        System.out.println();
        vehiculo2.mostrarEstado();
    }
}
