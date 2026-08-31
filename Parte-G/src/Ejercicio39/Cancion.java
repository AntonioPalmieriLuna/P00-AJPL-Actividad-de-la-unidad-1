package Ejercicio39;

public class Cancion {
    private String titulo,artista;
    private int duracion;

    public Cancion(){
        titulo="Nuestra Canción";
        artista="Periné";
        duracion=4;
    }

    public void mostraInfo() {
        System.out.println("Titulo: " + titulo + "\n"
                + "Artista: " + artista + "\n" +
                "Duración: " + duracion + " minutos" + "\n");
    }
    public static void main(String[] args) {
        Cancion cancion_prueba=new Cancion();
        cancion_prueba.mostraInfo();
    }
}
