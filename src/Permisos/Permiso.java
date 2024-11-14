package Permisos;

public abstract class Permiso {
    public abstract void mostrarPermiso();
    public abstract boolean tieneAcceso(String accion);
}
