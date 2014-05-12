package pe.com.controlasistencia.dao;

import java.util.List;

import pe.com.controlasistencia.entities.Recurso;

public interface RecursoDAO {
	
	public List<Recurso> listar();
    public String insert(Recurso atributo);
    public String update(Recurso atributo);
    public Recurso get(Integer atributo_id);

}
