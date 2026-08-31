package Ejercicio43;

public class Computador {
    private String marca,procesador;
    private int memoriaRAM,almacenamiento;

    public Computador(String marca, String procesador, int memoriaRAM, int almacenamiento){
        this.marca=marca;
        this.procesador=procesador;
        this.memoriaRAM=memoriaRAM;
        this.almacenamiento=almacenamiento;
    }

    public void mostrarInfo(){
        System.out.println("Marca: "+marca+"\n" +
                "Procesador: "+procesador+"\n" +
                "Memoria RAM: "+memoriaRAM+" GB\n" +
                "Almacenamiento: "+almacenamiento+" GB\n");
    }

    public static void main(String[] args) {
        Computador computador1=new Computador("Dell", "Intel Core i7", 16, 512);
        computador1.mostrarInfo();

        Computador computador2=new Computador("HP", "AMD Ryzen 5", 8, 256);
        computador2.mostrarInfo();
    }

    /*
    La diferencia radica en que el plano conceptual (la clase Computador) es solo una idea o diseño abstracto guardado en el código.
    El plano define la plantilla: establece que cualquier computador debe tener marca, procesador, memoria RAM y almacenamiento,
    además de especificar las acciones que podrá hacer (como mostrarInfo), pero no consume memoria real ni representa una máquina física.

    Por otro lado, una máquina concreta (un objeto como computador1 o computador2) es la instancia real construida a partir de ese plano.
    Ocupa un lugar real en la memoria del programa y posee valores específicos en sus atributos (por ejemplo, 16 GB de RAM en lugar de 8 GB).
    Es la diferencia entre tener los planos en papel de un carro y tener el carro físico encendido en el garaje.
     */
}