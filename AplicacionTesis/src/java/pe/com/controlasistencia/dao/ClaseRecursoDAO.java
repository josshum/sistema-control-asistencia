package pe.com.controlasistencia.dao;

import java.util.List;

import pe.com.controlasistencia.entities.ClaseRecurso;

public interface ClaseRecursoDAO {
	
	public List<ClaseRecurso> listar();
    public String insert(ClaseRecurso atributo);
    public String update(ClaseRecurso atributo);
    public ClaseRecurso get(Integer atributo_id);

}
