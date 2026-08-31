package Ejercicio37;

public class Celular {
    private String marca;
    private int bateria;
    private boolean prendido;

    public Celular(){
        this.marca="Samsung";
        this.bateria=80;
        this.prendido=false;
    }
    public Celular(String marca, int bateria, boolean prendido){
        this.marca=marca;
        this.bateria=bateria;
        this.prendido=prendido;
    }

    public void encender(){
        this.prendido=true;
    }
    public void apagar(){
        this.prendido=false;
    }
    public void cargarBateria(int cantidad){
        this.bateria+=cantidad;
    }
    public void mostrarEstado(){
        System.out.println("Marca: "+marca+"\n" +
                "Bateria: "+bateria+"\n" +
                "Prendido: "+prendido+"\n");
    }

    public static void main(String[]args){
        Celular celular_prueba=new Celular();
        celular_prueba.mostrarEstado();

        //prueba de encender celular
        celular_prueba.encender();
        celular_prueba.mostrarEstado();


        //prueba cargar bateria
        celular_prueba.cargarBateria(20);
        celular_prueba.mostrarEstado();

        //prueba de apagar celular
        celular_prueba.apagar();
        celular_prueba.mostrarEstado();

        System.out.println("-----------------------------");

        //prueba de crear celular con parametros
        Celular celular_prueba2=new Celular("Apple",50,true);
        celular_prueba2.mostrarEstado();

        //prueba cargar bateria con parametros
        celular_prueba2.cargarBateria(50);
        celular_prueba2.mostrarEstado();

        //prueba apagar celular con parametros
        celular_prueba2.apagar();
        celular_prueba2.mostrarEstado();

    }
}
