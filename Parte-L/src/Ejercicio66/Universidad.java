package Ejercicio66;

public class Universidad {
    private String nombre,rector,ciudad;
    private int fundacion;
    private String carrera;

    public Universidad(String nombre,String rector,String ciudad,int fundacion,String carrera){
        this.nombre=nombre;
        this.rector=rector;
        this.ciudad=ciudad;
        this.fundacion=fundacion;
        this.carrera=carrera;
    }

    public void mostrarInformacion(){
        System.out.println("Universidad: "+nombre+
                "\nRector: "+rector+
                "\nCiudad: "+ciudad+
                "\nFundacion: "+fundacion+
                "\nCarrera: "+carrera+"\n");
    }

    public static void main(String[] args){

        Universidad Universidad_De_Cartagena=new Universidad(
                "Universidad De Cartagena",
                "William Malkun",
                "Cartagena",
                1827,
                "Ingenieria");
        Universidad_De_Cartagena.mostrarInformacion();

        Universidad Universidad_San_Buenaventura=new Universidad(
                "Universidad San Buenaventura",
                "Fray José",
                "Cartagena",
                1708,
                "Fisioterapia");
        Universidad_San_Buenaventura.mostrarInformacion();
    }
}
