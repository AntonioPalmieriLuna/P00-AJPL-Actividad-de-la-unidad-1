package Ejercicio9;

public class Mascota {
    private String nombre,especie;
    private int edad;

    public Mascota(String nombre, String especie, int edad){
        this.nombre=nombre;
        this.especie=especie;
        this.edad=edad;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }

    public void mostrarMascota(){
        System.out.println("Nombre: "+nombre+"\n" +
                "Especie: "+especie+"\n" +
                "Edad: "+edad);
    }

    public static void main(String[]args){
        Mascota mascota=new Mascota("Yurkeison","Golden Retriever",3);

        mascota.mostrarMascota();
        System.out.println();

        //cambio de la edad

        mascota.setEdad(8);
        mascota.mostrarMascota();
        System.out.println();

        mascota.setEdad(12);
        mascota.mostrarMascota();
    }
}
