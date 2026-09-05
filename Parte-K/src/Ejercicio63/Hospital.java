package Ejercicio63;

/*
Diseño de la clase Hospital antes de programar:

Atributos que tendrá:
- nombre: String (nombre del hospital o clínica)
- camasDisponibles: int (número de camas libres para pacientes)
- medicosDeTurno: int (cantidad de médicos trabajando en el turno actual)

Métodos que tendrá:
- mostrarInfo(): muestra el estado actual del hospital
- ingresarPaciente(): ocupa una cama si hay disponibilidad
- darAltaPaciente(): libera una cama disponible

Objetos reales que se podrían construir:
- Hospital 1: "Hospital Universitario del Caribe", 45 camas disponibles, 12 médicos de turno
- Hospital 2: "Clínica Madre Bernarda", 10 camas disponibles, 6 médicos de turno
*/

public class Hospital {
    private String nombre;
    private int camasDisponibles;
    private int medicosDeTurno;

    public Hospital(String nombre, int camasDisponibles, int medicosDeTurno) {
        this.nombre = nombre;
        this.camasDisponibles = camasDisponibles;
        this.medicosDeTurno = medicosDeTurno;
    }

    public void ingresarPaciente() {
        if (camasDisponibles > 0) {
            camasDisponibles--;
            System.out.println("Paciente ingresado. Camas restantes: " + camasDisponibles);
        } else {
            System.out.println("No hay camas disponibles en " + nombre + ".");
        }
    }

    public void darAltaPaciente() {
        camasDisponibles++;
        System.out.println("Paciente dado de alta. Camas disponibles: " + camasDisponibles);
    }

    public void mostrarInfo() {
        System.out.println("Hospital: " + nombre + "\n" +
                "Camas disponibles: " + camasDisponibles + "\n" +
                "Médicos de turno: " + medicosDeTurno + "\n");
    }

    public static void main(String[] args) {
        Hospital hosp1 = new Hospital("Hospital Universitario del Caribe", 45, 12);
        hosp1.mostrarInfo();
        hosp1.ingresarPaciente();
        hosp1.darAltaPaciente();
        hosp1.mostrarInfo();

        Hospital hosp2 = new Hospital("Clínica Madre Bernarda", 1, 6);
        hosp2.mostrarInfo();
        hosp2.ingresarPaciente();
        hosp2.ingresarPaciente();
    }
}
