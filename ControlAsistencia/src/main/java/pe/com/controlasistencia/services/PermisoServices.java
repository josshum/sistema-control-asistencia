package pe.com.controlasistencia.services;

import java.util.List;

import pe.com.controlasistencia.entities.Permiso;

public interface PermisoServices {
	
	public List<Permiso> listar();
    public String insert(Permiso atributo);
    public String update(Permiso atributo);
    public Permiso get(Integer atributo_id);
}
