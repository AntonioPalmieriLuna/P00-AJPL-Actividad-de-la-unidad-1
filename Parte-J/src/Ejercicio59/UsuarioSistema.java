package Ejercicio59;

public class UsuarioSistema {
    private String nombreUsuario,clave;
    private boolean activo;

    public UsuarioSistema(String nombreUsuario, String clave, boolean activo){
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
        this.activo = activo;
    }

    public void activarUsuario(){
        activo = true;
    }

    public void desactivarUsuario(){
        activo = false;
    }

    public void mostrarUsuario(){
        System.out.println("Nombre de Usuario: "+nombreUsuario+"\n"
        + "Clave: "+clave+"\n"
        + "Activo: "+activo+"\n");
    }

    public static void main(String[] args) {
        UsuarioSistema usuario1 = new UsuarioSistema("Pepote", "clave123", true);
        usuario1.mostrarUsuario();

        usuario1.desactivarUsuario();
        usuario1.mostrarUsuario();

        usuario1.activarUsuario();
        usuario1.mostrarUsuario();
    }
}
