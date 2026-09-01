package Ejercicio47;

public class CuentaBancaria {

    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void mostrarSaldo(){
        System.out.println("Número de Cuenta: " + numeroCuenta + "\n" +
                "Saldo actual: " + saldo + "\n");
    }

    public static void main(String[] args){
        // 3. CÓDIGO CORREGIDO:
        // Se inicializa/crea el objeto mediante el operador 'new' y su constructor antes de usarlo.
        CuentaBancaria cuenta1 = new CuentaBancaria("123-456-789", 150000.0);
        cuenta1.mostrarSaldo();
    }
}

/*
 1. CÓDIGO ERRADO (Evidencia):
 package Ejercicio47;

 public class CuentaBancaria {

     private String numeroCuenta;
     private double saldo;

     public CuentaBancaria(String numeroCuenta, double saldo){
         this.numeroCuenta = numeroCuenta;
         this.saldo = saldo;
     }

     public void mostrarSaldo(){
         System.out.println("Número de Cuenta: " + numeroCuenta + "\n" +
                 "Saldo actual: " + saldo + "\n");
     }

     public static void main(String[] args){
         // ERROR: Se declara la variable de referencia pero NO se crea la instancia del objeto (falta 'new')
         CuentaBancaria cuenta1;
         cuenta1.mostrarSaldo(); // Intento de invocar un metodo sobre una variable no inicializada
     }
 }

 2. EXPLICACIÓN DEL MENSAJE DE ERROR DEL COMPILADOR:
 Al compilar este código donde una variable local de tipo referencia no ha sido inicializada,
 el compilador genera:

 - Error: "variable cuenta1 might not have been initialized"
   Explicación: En Java, las variables locales (las que se declaran dentro de métodos) no tienen
   un valor por defecto. Declarar 'CuentaBancaria cuenta1;' únicamente reserva el nombre de la
   variable de referencia en la pila (stack), pero no crea ningún objeto en memoria (heap).
   Cuando el compilador detecta que se intenta acceder a métodos o atributos ('cuenta1.mostrarSaldo()')
   sin haberle asignado un objeto previamente, bloquea la compilación para evitar fallos.
   
   (Nota: Si la variable se inicializara explícitamente en 'null', compilaría pero lanzaría la
   excepción 'NullPointerException' en tiempo de ejecución al intentar usarla).

 3. CORRECCIÓN DEL ERROR:
 Se corrigió instanciando el objeto utilizando el operador 'new' y llamando al constructor:
 'CuentaBancaria cuenta1 = new CuentaBancaria("123-456-789", 150000.0);'.
 De esta forma, el objeto queda creado en memoria con sus valores iniciales y la variable
 apunta a una referencia válida para invocar sus métodos.
*/
