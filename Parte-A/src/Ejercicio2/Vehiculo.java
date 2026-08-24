package Ejercicio2;

public class Vehiculo {

    private String marca,modelo;
    private int velocidadActual;

    public Vehiculo(){
        this.marca="Honda";
        this.modelo="Civic";
        this.velocidadActual=50;
    }

    public void mostrarEstado(){
        System.out.println("Marca: "+marca+"\n" +
                "Modelo: "+modelo+"\n" +
                "Velocidad Actual: "+velocidadActual);
    }


    public static void main(String[]args){
        Vehiculo vehiculo_prueba=new Vehiculo();
        vehiculo_prueba.mostrarEstado();
    }
}
