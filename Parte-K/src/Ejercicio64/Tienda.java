package Ejercicio64;

/*
Diseño de la clase Tienda antes de programar:

Atributos que tendrá:
- nombre: String (nombre del establecimiento comercial)
- direccion: String (ubicación física del local)
- dineroEnCaja: double (saldo actual en la caja de la tienda)

Métodos que tendrá:
- mostrarInfo(): muestra los datos generales de la tienda y su saldo en caja
- realizarVenta(double monto): suma dinero a la caja por una venta realizada
- pagarProveedor(double monto): descuenta dinero de la caja para pagar a proveedores

Objetos reales que se podrían construir:
- Tienda 1: "Supertienda El Ahorro", "Calle 15 # 4-50", dineroEnCaja: 500000.0
- Tienda 2: "Minimarket Don Pedro", "Av. Pedro de Heredia", dineroEnCaja: 120000.0
*/

public class Tienda {
    private String nombre;
    private String direccion;
    private double dineroEnCaja;

    public Tienda(String nombre, String direccion, double dineroEnCaja) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.dineroEnCaja = dineroEnCaja;
    }

    public void realizarVenta(double monto) {
        dineroEnCaja += monto;
        System.out.println("Venta realizada por " + monto + ". Dinero en caja: " + dineroEnCaja);
    }

    public void pagarProveedor(double monto) {
        if (monto <= dineroEnCaja) {
            dineroEnCaja -= monto;
            System.out.println("Pago a proveedor realizado por " + monto + ". Dinero en caja: " + dineroEnCaja);
        } else {
            System.out.println("Dinero insuficiente en caja para pagarn " + monto + ".");
        }
    }

    public void mostrarInfo() {
        System.out.println("Tienda: " + nombre + "\n" +
                "Dirección: " + direccion + "\n" +
                "Dinero en caja: $" + dineroEnCaja + "\n");
    }

    public static void main(String[] args) {
        Tienda tienda1 = new Tienda("Supertienda El Ahorro", "Calle 15 # 4-50", 500000.0);
        tienda1.mostrarInfo();
        tienda1.realizarVenta(150000.0);
        tienda1.pagarProveedor(200000.0);
        tienda1.mostrarInfo();

        Tienda tienda2 = new Tienda("Minimarket Don Pedro", "Av. Pedro de Heredia", 120000.0);
        tienda2.mostrarInfo();
        tienda2.pagarProveedor(150000.0);
    }
}
