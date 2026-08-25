package Ejercicio18;

public class Mascota {

    private String nombre,especie;
    private int edad;

    public Mascota(){
        this.nombre="Chona";
        this.especie="Mestizo";
        this.edad=12;
    }

    public void cumplirAnios(int anios){
        this.edad=edad+anios;
    }
    public void mostrarMascota(){
        System.out.println("Nombre: "+nombre+"\n" +
                "Especie: "+especie+"\n" +
                "Edad: "+edad+"\n");
    }

    public static void main(String[]args){
        Mascota mascota_prueba=new Mascota();
        mascota_prueba.mostrarMascota();
        mascota_prueba.cumplirAnios(2);
        mascota_prueba.mostrarMascota();
    }
}
