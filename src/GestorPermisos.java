import Permisos.GrupoDePermisos;
import Permisos.Permiso;
import Permisos.PermisoSimple;

public class GestorPermisos {
    public static void main(String[] args) {
        // Crear permisos simples
        Permiso leerArchivos = new PermisoSimple("leer archivos");
        Permiso escribirArchivos = new PermisoSimple("escribir archivos");
        Permiso modificarUsuarios = new PermisoSimple("modificar usuarios");

        // Crear un grupo de permisos para usuario avanzado
        GrupoDePermisos usuarioAvanzado = new GrupoDePermisos("Usuario Avanzado");
        usuarioAvanzado.agregarPermiso(leerArchivos);
        usuarioAvanzado.agregarPermiso(escribirArchivos);

        // Crear un grupo de permisos para administrador
        GrupoDePermisos administrador = new GrupoDePermisos("Administrador");
        administrador.agregarPermiso(modificarUsuarios);
        administrador.agregarPermiso(usuarioAvanzado);  // Agrega todos los permisos del grupo "Usuario Avanzado"

        // Ver permisos
        administrador.mostrarPermiso();

        // Comprobar accesos
        System.out.println("Acceso a 'modificar usuarios': " + administrador.tieneAcceso("modificar usuarios"));
        System.out.println("Acceso a 'leer archivos': " + administrador.tieneAcceso("leer archivos"));
        System.out.println("Acceso a 'eliminar archivos': " + administrador.tieneAcceso("eliminar archivos"));
    }
}
