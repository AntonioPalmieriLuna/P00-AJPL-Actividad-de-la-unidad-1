package Ejercicio57;

public class NotaAcademica {
    private String asignatura;
    private float nota1,nota2,nota3;

    public NotaAcademica(String asignatura,float nota1,float nota2,float nota3){
        this.asignatura = asignatura;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public float calcularDefinitiva(){
        return (nota1+nota2+nota3)/3;
    }

    public void mostrarNota(){
        System.out.println("Asignatura: " + asignatura + "\n" +
                "Nota 1: " + nota1 + "\n" +
                "Nota 2: " + nota2 + "\n" +
                "Nota 3: " + nota3 + "\n" +
                "Definitiva: " + calcularDefinitiva()+"\n"
        );
    }
    public static void main(String[] args){
        NotaAcademica nota_estudiante = new NotaAcademica("Programacion",4.5f,3.5f,4.0f);
        nota_estudiante.mostrarNota();

        NotaAcademica nota_estudiante2 = new NotaAcademica("Base de Datos",3f,0f,3.2f);
        nota_estudiante2.mostrarNota();
    }
}
