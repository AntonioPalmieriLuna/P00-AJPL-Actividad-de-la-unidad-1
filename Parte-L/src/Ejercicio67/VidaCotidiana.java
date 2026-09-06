package Ejercicio67;

public class VidaCotidiana {
    private String nombre;
    private int edad;
    private String profesion;
    private String ciudad;

    public VidaCotidiana(String nombre, int edad, String profesion, String ciudad){
        this.nombre=nombre;
        this.edad=edad;
        this.profesion=profesion;
        this.ciudad=ciudad;
    }

    public void levantarse(){
        System.out.println(nombre+ " se está levantando de la cama");
    }
    public void cepillarse(){
        System.out.println(nombre+ " se está cepillando los dientes");
    }
    public void desayunar(){
        System.out.println(nombre+ " está desayunando");
    }
    public void ir_a_la_universidad(){
        System.out.println(nombre+ " se está dirigiendo a la universidad desde: "+ciudad);
    }
    public void estudiar(){
        System.out.println(nombre+ " está estudiando");
    }
    public void almorzar(){
        System.out.println(nombre+ " está almorzando");
    }
    public void regresar_a_la_casa(){
        System.out.println(nombre+ " está regresando a su casa en : "+ciudad);
    }
    public void cenar(){
        System.out.println(nombre+ " está cenando");
    }
    public void dormir(){
        System.out.println(nombre+ " está durmiendo");
    }

    public void mostrarInformacion(){
        System.out.println("\nNombre: "+nombre+
                "\nEdad: "+edad+
                "\nProfesion: "+profesion+
                "\nCiudad: "+ciudad);
    }

    public static void main(String[]args){
        VidaCotidiana Antonio=new VidaCotidiana("Antonio",17,"Estudiante","Turbaco");
        Antonio.levantarse();

        Antonio.cepillarse();

        Antonio.desayunar();

        Antonio.ir_a_la_universidad();

        Antonio.estudiar();

        Antonio.almorzar();

        Antonio.regresar_a_la_casa();

        Antonio.cenar();

        Antonio.cepillarse();

        Antonio.dormir();

        Antonio.mostrarInformacion();
    }
}
