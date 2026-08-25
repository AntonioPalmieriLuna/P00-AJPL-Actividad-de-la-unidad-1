package Ejercicio12;

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

    public void frenar(){
        velocidadActual-=10;
        if(velocidadActual<0){
            velocidadActual=0;
        }
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

        // despues de acelerar
        vehiculo.acelerar();
        vehiculo.mostrarEstado();

        System.out.println();

        // despues de frenar
        vehiculo.frenar();
        vehiculo.mostrarEstado();

        System.out.println();

        // comprobrar si NO lo deja negativo
        vehiculo.frenar();
        vehiculo.mostrarEstado();
    }
}
