package Ejercicio74;

/*
EJERCICIO 74: COMPARACIÓN DE LAS TRES FORMAS DE CONSTRUCCIÓN Y ARGUMENTACIÓN

1. CONSTRUCTOR POR DEFECTO / SIN PARÁMETROS:
   - Definición: No recibe argumentos de entrada. Asigna valores por defecto del sistema (null, 0, false)
     o valores constantes predeterminados dentro de su cuerpo.
   - Ventajas: Sencillo de invocar cuando se requiere un objeto base sin configuración previa.
   - Desventajas: Si asigna valores fijos, todos los objetos creados serán idénticos inicialmente, obligando
     a modificar sus atributos posteriormente y aumentando el riesgo de estados incompletos.

2. CONSTRUCTOR CON PARÁMETROS:
   - Definición: Recibe explícitamente los valores iniciales para los atributos al momento de la instanciación.
   - Ventajas: Garantiza que el objeto nazca completo, válido y en un estado consistente desde su primera línea
     de vida. Evita código redundante y líneas adicionales de configuración.
   - Desventajas: Requiere conocer y proporcionar todos los argumentos necesarios al momento de crearlo.

3. CONSTRUCTOR COPIA:
   - Definición: Recibe como argumento una instancia existente de la misma clase y replica sus valores en un nuevo
     objeto independiente en memoria.
   - Ventajas: Facilita la clonación y creación de duplicados exactos sin alterar el objeto original ni compartir
     referencias mutables indebidas.
   - Desventajas: Depende obligatoriamente de la existencia previa de otro objeto instanciado y configurado.

ARGUMENTACIÓN: ¿CUÁL ES MÁS CLARA Y PRÁCTICA PARA PRINCIPIANTES?
Para un principiante en Programación Orientada a Objetos, el CONSTRUCTOR CON PARÁMETROS es, sin duda,
la forma más clara, intuitiva y formativa. 

Razones:
1. Correspondencia directa: Hace totalmente visible la relación de causa y efecto: "Para crear un estudiante,
   necesito su nombre, su código y su semestre". No hay valores ocultos ni suposiciones implícitas.
2. Integridad inmediata: Evita que el estudiante deje objetos a medio llenar o con datos incoherentes.
3. Eficiencia: Permite instanciar y definir la identidad completa del objeto en una sola instrucción concisa.
*/

public class ComparacionConstructores {

    // Demostración de las 3 formas en una misma clase ilustrativa:
    public static class Libro {
        private String titulo;
        private String autor;
        private int paginas;

        // 1. Constructor sin parámetros
        public Libro() {
            this.titulo = "Sin título";
            this.autor = "Anónimo";
            this.paginas = 0;
        }

        // 2. Constructor con parámetros
        public Libro(String titulo, String autor, int paginas) {
            this.titulo = titulo;
            this.autor = autor;
            this.paginas = paginas;
        }

        // 3. Constructor copia
        public Libro(Libro otro) {
            this.titulo = otro.titulo;
            this.autor = otro.autor;
            this.paginas = otro.paginas;
        }

        public void mostrar() {
            System.out.println("Libro: " + titulo + " | Autor: " + autor + " | Páginas: " + paginas);
        }
    }

    public static void main(String[] args) {
        System.out.println("1. Constructor por defecto / sin parámetros");
        Libro l1 = new Libro();
        l1.mostrar();

        System.out.println("\n2. Constructor con parámetros (Más claro para principiantes)");
        Libro l2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 471);
        l2.mostrar();

        System.out.println("\n3. Constructor copia");
        Libro l3 = new Libro(l2);
        l3.mostrar();
    }
}
