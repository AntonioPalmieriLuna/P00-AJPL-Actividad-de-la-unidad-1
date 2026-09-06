package Ejercicio70;

/*
EJERCICIO 70: EXPLICACIÓN DETALLADA DE LAS CLASES DISEÑADAS (66, 67 y 68)

1. PRIMERA CLASE: Universidad (Contexto Académico - Ejercicio 66)

Cuál fue la clase:
  - Clase 'Universidad', diseñada para representar una institución de educación superior
    y organizar la información esencial de su estructura académica.

Cuáles fueron los objetos:
  - u1: Universidad de Cartagena (Rector: William Malkun, Ciudad: Cartagena, Fundación: 1827, Carrera: Ingeniería de Sistemas).
  - u2: Universidad Nacional de Colombia (Rector: Dolly Montoya, Ciudad: Bogotá, Fundación: 1867, Carrera: Medicina).
  - u3: Universidad de Antioquia (Rector: John Jairo Arboleda, Ciudad: Medellín, Fundación: 1803, Carrera: Derecho).
  - u4: Universidad del Norte (Rector: Adolfo Meisel, Ciudad: Barranquilla, Fundación: 1966, Carrera: Administración de Empresas).
  - u5: Universidad Industrial de Santander (Rector: Hernán Porras, Ciudad: Bucaramanga, Fundación: 1948, Carrera: Ingeniería Química).

Cuáles fueron sus atributos:
  - nombre (String): Nombre de la institución universitaria.
  - rector (String): Nombre del rector o máxima autoridad académica.
  - ciudad (String): Ciudad donde tiene su sede principal.
  - fundacion (int): Año de fundación de la universidad.
  - carrera (String): Programa académico o facultad que se destaca/estudia.

Cuáles fueron sus comportamientos:
  - mostrarInformacion(): Imprime en consola de manera organizada y legible todos los
    datos y características del objeto Universidad.


2. SEGUNDA CLASE: VidaCotidiana (Diario Vivir - Ejercicio 67)

Cuál fue la clase:
  - Clase 'VidaCotidiana', modelada para representar a una persona y el flujo de
    actividades, hábitos y rutinas que ejecuta durante su día a día.

Cuáles fueron los objetos:
  - p1: Antonio (17 años, Estudiante de Ingeniería, Turbaco).
  - p2: Carlos (25 años, Desarrollador de Software, Cartagena).
  - p3: María (21 años, Diseñadora Gráfica, Medellín).
  - p4: Andrés (30 años, Docente Universitario, Barranquilla).
  - p5: Laura (19 años, Estudiante de Medicina, Bogotá).

Cuáles fueron sus atributos:
  - nombre (String): Nombre de la persona.
  - edad (int): Edad en años cumplidos.
  - profesion (String): Ocupación, profesión o actividad principal.
  - ciudad (String): Lugar de residencia.

Cuáles fueron sus comportamientos:
  - levantarse(), cepillarse(), desayunar(), ir_a_la_universidad(), estudiar(),
    almorzar(), regresar_a_la_casa(), cenar(), dormir(): Métodos que simulan cada
    una de las acciones y transiciones de la rutina diaria.
  - mostrarInformacion(): Muestra el perfil y estado general de la persona.


3. TERCERA CLASE: Negocio (Contexto Comercial/Empresarial - Ejercicio 68)

Cuál fue la clase:
  - Clase 'Negocio', estructurada para gestionar una unidad productiva o establecimiento
    comercial con su inventario y personal.

Cuáles fueron los objetos:
  - n1: Grupo Nutresa (Dueño: Jaime Gilinski, Producto: Galletas Saltín Noel, Stock: 1000, Empleados: 100).
  - n2: Almacenes Éxito (Dueño: Carlos Mario Giraldo, Producto: Abarrotes y Tecnología, Stock: 5000, Empleados: 350).
  - n3: Panadería La Delicia (Dueño: Roberto Gómez, Producto: Pan Francés, Stock: 300, Empleados: 8).
  - n4: Farmacia Drogas La Rebaja (Dueño: Coopservir, Producto: Medicamentos, Stock: 1500, Empleados: 25).
  - n5: Ferretería El Tornillo (Dueño: Pedro Martínez, Producto: Herramientas, Stock: 800, Empleados: 12).

Cuáles fueron sus atributos:
  - nombre (String): Razón social o nombre comercial del negocio.
  - direccion (String): Dirección física del local o sede.
  - dueño (String): Propietario o representante legal.
  - producto (String): Producto principal comercializado.
  - telefono (int): Número telefónico de contacto.
  - stock (int): Cantidad de unidades de producto disponibles.
  - empleados (int): Número total de trabajadores contratados.

Cuáles fueron sus comportamientos:
  - mostraInformacion(): Despliega la ficha técnica y comercial completa del negocio
    con todos sus datos operativos.
*/

public class ExplicacionConsolidacion {
    public static void main(String[] args) {
        System.out.println("EJERCICIO 70: RESUMEN EXPLICATIVO DE LAS CLASES, OBJETOS Y DISEÑO");
        System.out.println("1. Clase Academica: Universidad (Atributos: nombre, rector, ciudad, fundacion, carrera , Metodo: mostrarInformacion)");
        System.out.println("2. Clase Vida Cotidiana: VidaCotidiana (Atributos: nombre, edad, profesion, ciudad, Metodos: rutinas diarias(levantarse, cepillarse,etc) y mostrarInformacion)");
        System.out.println("3. Clase Comercial: Negocio (Atributos: nombre, direccion, dueño, producto, telefono, stock, empleados , Metodo: mostraInformacion)");
        System.out.println("\n(Ver comentarios detallados en el codigo fuente para el informe exhaustivo).");
    }
}
