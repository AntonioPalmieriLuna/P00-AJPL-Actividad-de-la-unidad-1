package Ejercicio51;

import java.sql.SQLOutput;

public class Rectangulo {
    private int base,altura;

    public Rectangulo(int base, int altura){
        this.base=base;
        this.altura=altura;
    }

    public int calcularArea(){
        return base*altura;
    }
    public int calcularPerimetro(){
        return (base*2)+(altura*2);
    }

    public void mostrarResultados(){
        System.out.println("Base del triangulo: "+base+"\n"+
                "Altura del triangulo: "+altura+"\n"+
                "Area del triangulo: "+calcularArea()+"\n"+
                "Perimetro del triangulo: "+calcularPerimetro()+"\n");
    }

    public static void main(String[]args){
        Rectangulo rectangulo1=new Rectangulo(10,5);
        rectangulo1.mostrarResultados();
        
        Rectangulo rectangulo2=new Rectangulo(3,2);
        rectangulo2.mostrarResultados();
    }
}
