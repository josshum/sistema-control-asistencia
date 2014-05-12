package pe.com.controlasistencia.dao;

import java.util.List;

import pe.com.controlasistencia.entities.Curso;

public interface CursoDAO {
	
	public List<Curso> listar();
    public String insert(Curso atributo);
    public String update(Curso atributo);
    public Curso get(Integer atributo_id);

}
