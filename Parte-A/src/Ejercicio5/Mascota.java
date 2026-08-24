package Ejercicio5;

public class Mascota {

    private String nombre,especie;
    private int edad;

    public Mascota(){
        this.nombre="Chona";
        this.especie="Mestizo";
        this.edad=12;
    }

    public void mostrarMascota(){
        System.out.println("Nombre: "+nombre+"\n" +
                "Especie: "+especie+"\n" +
                "Edad: "+edad);
    }

    public static void main(String[]args){
        Mascota mascota_prueba=new Mascota();
        mascota_prueba.mostrarMascota();
    }
}
