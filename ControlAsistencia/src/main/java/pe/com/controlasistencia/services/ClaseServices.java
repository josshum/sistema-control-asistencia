package pe.com.controlasistencia.services;

import java.util.List;

import pe.com.controlasistencia.entities.Clase;

public interface ClaseServices {
	
	public List<Clase> listar();
    public String insert(Clase atributo);
    public String update(Clase atributo);
    public Clase get(Integer atributo_id);

}
