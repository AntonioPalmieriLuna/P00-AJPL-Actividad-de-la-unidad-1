package Ejercicio50;

public class Carro {

    private String marca;
    private String modelo;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n");
    }

    public static void main(String[] args) {
        // 3. CÓDIGO CORREGIDO:
        // Se construye la instancia del objeto usando 'new Carro(...)' para poder utilizarlo.
        Carro carro1 = new Carro("Toyota", "Corolla");
        carro1.mostrarInfo();
    }
}

/*
 1. CÓDIGO ERRADO (Evidencia):
 package Ejercicio50;

 public class Carro {
     private String marca;
     private String modelo;

     public Carro(String marca, String modelo) {
         this.marca = marca;
         this.modelo = modelo;
     }

     public void mostrarInfo() {
         System.out.println("Marca: " + marca + "\n" +
                 "Modelo: " + modelo + "\n");
     }

     public static void main(String[] args) {
         // ERROR: Se define la clase pero nunca se construye el objeto en el main
         System.out.println("Programa iniciado, pero no hay objetos creados.");
     }
 }

 2. EXPLICACIÓN DEL ERROR:
 - Explicación: Aunque la clase 'Carro' está correctamente definida y compila sin errores, si en el metodo 'main' nunca
 se construye un objeto (usando 'new Carro(...)'), la clase solo actúa como una plantilla que nunca llega a ejecutarse
 ni ocupar memoria para representar datos reales.

 3. CORRECCIÓN DEL ERROR:
 Se instancia el objeto dentro del metodo 'main' llamando al constructor con 'new Carro("Toyota", "Corolla")' y se
 invocan sus métodos para ejecutar el comportamiento deseado.
*/
