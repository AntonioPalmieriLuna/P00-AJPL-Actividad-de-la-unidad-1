package Ejercicio69;

import Ejercicio66.Universidad;
import Ejercicio67.VidaCotidiana;
import Ejercicio68.Negocio;

public class ObjetosConsolidacion {
    public static void main(String[] args) {
        System.out.println("5 OBJETOS DE LA CLASE UNIVERSIDAD (EJERCICIO 66)");
        System.out.println();
        Universidad u1 = new Universidad("Universidad de Cartagena", "William Malkun", "Cartagena", 1827, "Ingeniería de Sistemas");
        Universidad u2 = new Universidad("Universidad Nacional de Colombia", "Dolly Montoya", "Bogotá", 1867, "Medicina");
        Universidad u3 = new Universidad("Universidad de Antioquia", "John Jairo Arboleda", "Medellín", 1803, "Derecho");
        Universidad u4 = new Universidad("Universidad del Norte", "Adolfo Meisel", "Barranquilla", 1966, "Administración de Empresas");
        Universidad u5 = new Universidad("Universidad Industrial de Santander", "Hernán Porras", "Bucaramanga", 1948, "Ingeniería Química");

        u1.mostrarInformacion();
        u2.mostrarInformacion();
        u3.mostrarInformacion();
        u4.mostrarInformacion();
        u5.mostrarInformacion();

        System.out.println();
        System.out.println("5 OBJETOS DE LA CLASE VIDA COTIDIANA (EJERCICIO 67)");
        System.out.println();
        VidaCotidiana p1 = new VidaCotidiana("Antonio", 17, "Estudiante de Ingeniería", "Turbaco");
        VidaCotidiana p2 = new VidaCotidiana("Carlos", 25, "Desarrollador de Software", "Cartagena");
        VidaCotidiana p3 = new VidaCotidiana("María", 21, "Diseñadora Gráfica", "Medellín");
        VidaCotidiana p4 = new VidaCotidiana("Andrés", 30, "Docente Universitario", "Barranquilla");
        VidaCotidiana p5 = new VidaCotidiana("Laura", 19, "Estudiante de Medicina", "Bogotá");

        p1.mostrarInformacion();
        p1.levantarse();
        p1.estudiar();

        p2.mostrarInformacion();
        p2.levantarse();
        p2.almorzar();

        p3.mostrarInformacion();
        p3.levantarse();
        p3.regresar_a_la_casa();

        p4.mostrarInformacion();
        p4.levantarse();
        p4.cenar();

        p5.mostrarInformacion();
        p5.levantarse();
        p5.dormir();

        System.out.println();
        System.out.println("5 OBJETOS DE LA CLASE NEGOCIO (EJERCICIO 68)");
        System.out.println();
        Negocio n1 = new Negocio("Grupo Nutresa", "Mzn 3 Lt 23", "Jaime Gilinski", "Galletas Saltín Noel", 123456789, 1000, 100);
        Negocio n2 = new Negocio("Almacenes Éxito", "Av. Pedro de Heredia", "Carlos Mario Giraldo", "Abarrotes y Tecnología", 987654321, 5000, 350);
        Negocio n3 = new Negocio("Panadería La Delicia", "Calle 15 # 4-20", "Roberto Gómez", "Pan Francés", 300123456, 300, 8);
        Negocio n4 = new Negocio("Farmacia Drogas La Rebaja", "Centro Cra 7", "Coopservir", "Medicamentos", 311987654, 1500, 25);
        Negocio n5 = new Negocio("Ferretería El Tornillo", "Av. El Consulado", "Pedro Martínez", "Herramientas", 315456789, 800, 12);

        n1.mostraInformacion();
        n2.mostraInformacion();
        n3.mostraInformacion();
        n4.mostraInformacion();
        n5.mostraInformacion();
    }
}
