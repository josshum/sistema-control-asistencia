package pe.com.controlasistencia.dao;

import java.util.List;

import pe.com.controlasistencia.entities.Clase;

public interface ClaseDAO {
	
	public List<Clase> listar();
    public String insert(Clase atributo);
    public String update(Clase atributo);
    public Clase get(Integer atributo_id);

}
