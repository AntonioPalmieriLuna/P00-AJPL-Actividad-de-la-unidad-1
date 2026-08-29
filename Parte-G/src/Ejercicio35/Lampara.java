package Ejercicio35;

public class Lampara {
    private String marca;
    private boolean encendida;

    public Lampara(){
        this.marca="LG";
        this.encendida=false;
    }
    public Lampara(String marca){
        this.marca=marca;
        this.encendida=false;
    }

    public void encender(){
        this.encendida=true;
    }

    public void apagar(){
        this.encendida=false;
    }

    public void mostrarEstado(){
        System.out.println("Marca: "+marca+"\n" +
                "Encendida: "+encendida+"\n");
    }
    public static void main(String[] args) {
        Lampara lampara1=new Lampara();
        lampara1.mostrarEstado();

        System.out.println("encendido");
        lampara1.encender();
        lampara1.mostrarEstado();

        System.out.println("apagado");
        lampara1.apagar();
        lampara1.mostrarEstado();

        Lampara lampara2=new Lampara("Samsung");
        lampara2.mostrarEstado();

        System.out.println("encendido");
        lampara2.encender();
        lampara2.mostrarEstado();

        System.out.println("apagado");
        lampara2.apagar();
        lampara2.mostrarEstado();
    }
}
