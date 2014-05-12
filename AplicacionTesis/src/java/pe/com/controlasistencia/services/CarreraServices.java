package pe.com.controlasistencia.services;

import java.util.List;

import pe.com.controlasistencia.entities.Carrera;

public interface CarreraServices {
	
	public List<Carrera> listar();
    public String insert(Carrera atributo);
    public String update(Carrera atributo);
    public Carrera get(Integer atributo_id);

}
