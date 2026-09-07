package Ejercicio75;

/*
EJERCICIO 75: CONCLUSIÓN FINAL SOBRE LOS FUNDAMENTOS DE LA PROGRAMACIÓN ORIENTADA A OBJETOS EN JAVA

1. ¿QUÉ ES UNA CLASE?
Una clase es el plano arquitectónico, plantilla o modelo conceptual que define las características
estructurales y operativas que compartirán todos los elementos pertenecientes a una misma categoría.
En el paradigma de la Programación Orientada a Objetos (POO), la clase no representa un dato concreto
en memoria de ejecución, sino la especificación abstracta: determina qué datos o propiedades (atributos)
describen a la entidad y qué acciones, funciones o algoritmos (métodos) es capaz de ejecutar. Actúa como
un nuevo tipo de dato definido por el programador para modelar entidades del mundo real o conceptual.

2. ¿QUÉ ES UN OBJETO?
Un objeto es una entidad individual, concreta e independiente creada a partir del molde que define una clase.
Posee tres características fundamentales:
- Estado: Representado por los valores específicos asignados a sus atributos en un momento dado.
- Comportamiento: Definido por los métodos que puede ejecutar en respuesta a mensajes o llamadas.
- Identidad: Cada objeto ocupa una posición única e irrepetible en la memoria (Heap), lo que permite
  distinguirlo de cualquier otro objeto, incluso si ambos poseen exactamente los mismos valores en sus atributos.

3. ¿QUÉ SIGNIFICA INSTANCIAR?
Instanciar es el acto de materializar o dar vida en memoria a un objeto a partir de la definición de una clase.
En Java, este proceso se realiza principalmente mediante el operador 'new', el cual solicita a la Máquina
Virtual de Java (JVM) la reserva del espacio de memoria necesario en el Heap para almacenar los atributos del
nuevo objeto, seguido inmediatamente por la invocación del metodo 'Constructor', cuya función esencial es
asignar el estado inicial válido a la instancia y retornar la referencia a la memoria donde quedó alojada.

4. ¿POR QUÉ JAVA USA CLASES COMO BASE DE LA POO?
Java adoptó las clases como la unidad fundamental de construcción por motivos de solidez, seguridad y modularidad:
- Encapsulamiento y Control: Agrupar datos y operaciones dentro de clases permite proteger la integridad
  del estado interno mediante modificadores de acceso (private, protected, public), impidiendo accesos
  indebidos o corrupciones de datos desde el exterior.
- Tipado Fuerte y Seguridad en Compilación: Al basar todo en clases y tipos estrictos, el compilador.
  de Java puede detectar errores de tipo, inconsistencias y fallos estructurales antes de la ejecución.
- Mantenibilidad y Reutilización: La organización en clases facilita estructurar proyectos complejos
  en módulos independientes, favoreciendo la extensibilidad a través de la herencia, el polimorfismo y las
  interfaces.
- Gestión de Memoria y Ciclo de Vida: Permite que la JVM gestione de forma uniforme el ciclo de vida
  de todos los elementos del sistema, apoyándose en el Garbage Collector para liberar memoria cuando los
  objetos ya no tienen referencias activas.
*/

public class ConclusionFinal {
    public static void main(String[] args) {
        System.out.println("CONCLUSIÓN FINAL: FUNDAMENTOS DE LA POO EN JAVA");
        System.out.println("1. CLASE: Plano conceptual que define atributos y métodos de una entidad.");
        System.out.println("2. OBJETO: Instancia concreta con estado, comportamiento e identidad única en memoria.");
        System.out.println("3. INSTANCIAR: Proceso de reservar memoria ('new') e inicializar un objeto (Constructor).");
        System.out.println("4. JAVA Y LAS CLASES: Garantizan encapsulamiento, tipado fuerte, modularidad y seguridad.");
    }
}
