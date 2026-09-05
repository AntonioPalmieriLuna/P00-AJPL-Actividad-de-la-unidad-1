package Ejercicio65;

/*
Diseño de la clase EquipoDeFutbol antes de programar:

Atributos que tendrá:
- nombre: String (nombre del equipo o club)
- directorTecnico: String (nombre del director técnico)
- puntos: int (puntos acumulados en la tabla de posiciones)

Métodos que tendrá:
- mostrarInfo(): muestra los datos del equipo y sus puntos actuales
- ganarPartido(): suma 3 puntos por victoria
- empatarPartido(): suma 1 punto por empate

Objetos reales que se podrían construir:
- Equipo 1: "Real Cartagena", director técnico "Alberto Suárez", 15 puntos
- Equipo 2: "Junior de Barranquilla", director técnico "Arturo Reyes", 22 puntos
*/

public class EquipoDeFutbol {
    private String nombre;
    private String directorTecnico;
    private int puntos;

    public EquipoDeFutbol(String nombre, String directorTecnico, int puntos) {
        this.nombre = nombre;
        this.directorTecnico = directorTecnico;
        this.puntos = puntos;
    }

    public void ganarPartido() {
        puntos += 3;
        System.out.println(nombre + " ganó el partido (+3 pts). Puntos acumulados: " + puntos);
    }

    public void empatarPartido() {
        puntos += 1;
        System.out.println(nombre + " empató el partido (+1 pt). Puntos acumulados: " + puntos);
    }

    public void mostrarInfo() {
        System.out.println("Equipo: " + nombre + "\n" +
                "Director Técnico: " + directorTecnico + "\n" +
                "Puntos en la tabla: " + puntos + "\n");
    }

    public static void main(String[] args) {
        EquipoDeFutbol equipo1 = new EquipoDeFutbol("Real Cartagena", "Alberto Suárez", 15);
        equipo1.mostrarInfo();
        equipo1.ganarPartido();
        equipo1.empatarPartido();
        equipo1.mostrarInfo();

        EquipoDeFutbol equipo2 = new EquipoDeFutbol("Junior de Barranquilla", "Arturo Reyes", 22);
        equipo2.mostrarInfo();
        equipo2.ganarPartido();
    }
}
