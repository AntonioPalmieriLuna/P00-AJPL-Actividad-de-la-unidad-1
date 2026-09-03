package Ejercicio56;

public class Temperatura {
    private double temperaturaCelcius;
    private double temperaturaFarenheit;

    public Temperatura(double temperaturaCelcius){
        this.temperaturaCelcius = temperaturaCelcius;
    }

    public void convertirFahrenheit(){
        temperaturaFarenheit = (temperaturaCelcius * 1.8) + 32;
    }

    public void mostrarTemperatura(){
        System.out.println("Temperatura en Celcius: " + temperaturaCelcius+"\n"+
                "Temperatura en Fahrenheit: " + temperaturaFarenheit);
    }

    public static void main(String[] args){
        Temperatura temperatura = new Temperatura(25);
        temperatura.convertirFahrenheit();
        temperatura.mostrarTemperatura();
    }
}
