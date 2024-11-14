package Permisos;

public class PermisoSimple extends Permiso {
    private String nombre;

    public PermisoSimple(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void mostrarPermiso(){
        System.out.println("Permiso: "+nombre);
    }

    @Override
    public boolean tieneAcceso(String accion) {
        return nombre.equals(accion);
    }
}
