package Ejercicio38;

public class Ventilador {

    private String marca;
    private int velocidad;
    private boolean encendido;

    public Ventilador(){
        this.marca="LG";
        this.velocidad=90;
        this.encendido=false;
    }

    public Ventilador(String marca, int velocidad, boolean encendido){
        this.marca=marca;
        this.velocidad=velocidad;
        this.encendido=encendido;
    }

    public void encender(){
        this.encendido=true;
    }
    public void apagar(){
        this.encendido=false;
    }

    public void subirVelocidad(int cantidad){
        this.velocidad+=cantidad;
    }

    public void mostrarEstado(){
        System.out.println("Marca: "+marca+"\n" +
                "Velocidad: "+velocidad+"\n" +
                "Encendido: "+encendido+"\n");
    }

    public static void main(String[] args) {

        Ventilador ventilador_prueba=new Ventilador();
        ventilador_prueba.mostrarEstado();

        //prueba de encender ventilador
        ventilador_prueba.encender();
        ventilador_prueba.mostrarEstado();

        //prueba de subir velocidad
        ventilador_prueba.subirVelocidad(10);
        ventilador_prueba.mostrarEstado();

        //prueba de apagar ventilador
        ventilador_prueba.apagar();
        ventilador_prueba.mostrarEstado();

        System.out.println("------------------------");
        //prueba de crear ventilador con parametros
        Ventilador ventilador_prueba2=new Ventilador("Samurai",100,true);
        ventilador_prueba2.mostrarEstado();

        //prueba de subir velocidad con parametros
        ventilador_prueba2.subirVelocidad(20);
        ventilador_prueba2.mostrarEstado();

        //prueba de apagar ventilador con parametros
        ventilador_prueba2.apagar();
        ventilador_prueba2.mostrarEstado();
    }
}
