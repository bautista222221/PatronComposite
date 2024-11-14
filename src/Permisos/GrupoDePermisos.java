package Permisos;

import java.util.ArrayList;
import java.util.List;

public class GrupoDePermisos extends Permiso {

    private String nombre;
    private List<Permiso> permisos = new ArrayList<>();

    public GrupoDePermisos(String nombre){
        this.nombre = nombre;
    }

    public void agregarPermiso(Permiso permiso){
        this.permisos.add(permiso);
    }

    public void eliminarPermiso(Permiso permiso){
        this.permisos.remove(permiso);
    }

    @Override
    public void mostrarPermiso() {
        System.out.println("Grupo: "+nombre);
        for (Permiso p : permisos){
            p.mostrarPermiso();
        }
    }

    @Override
    public boolean tieneAcceso(String accion) {
        for (Permiso p : permisos){
            if(p.tieneAcceso(accion)){
                return true;
            }
        }
        return false;
    }
}
