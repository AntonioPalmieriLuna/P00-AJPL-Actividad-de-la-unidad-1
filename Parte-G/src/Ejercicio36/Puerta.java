package Ejercicio36;

public class Puerta {
    private String material;
    private boolean abierta;

    public Puerta(){
        this.material="Madera";
        this.abierta=false;
    }
    public Puerta(String material, boolean abierta){
        this.material="Madera";
        this.abierta=abierta;
    }

    public void abrir(){
        this.abierta=true;
    }
    public void cerrar(){
        this.abierta=false;
    }
    public void mostrarEstado(){
        System.out.println("Material: "+material+"\n" +
                "Abierta: "+abierta+"\n");
    }
    public static void main(String[]args){
        Puerta puerta_prueba=new Puerta();
        puerta_prueba.mostrarEstado();

        //prueba de abrir puerta

        puerta_prueba.abrir();
        puerta_prueba.mostrarEstado();

        //prueba de cerrar puerta
        puerta_prueba.cerrar();
        puerta_prueba.mostrarEstado();


        System.out.println("---------------------------");

        //prueba de crear puerta con parametros
        Puerta puerta_prueba2=new Puerta("Metal",true);
        puerta_prueba2.mostrarEstado();

        //prueba de cerrar puerta con parametros
        puerta_prueba2.cerrar();
        puerta_prueba2.mostrarEstado();
    }
}
