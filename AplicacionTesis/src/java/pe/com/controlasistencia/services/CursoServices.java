package pe.com.controlasistencia.services;

import java.util.List;

import pe.com.controlasistencia.entities.Curso;

public interface CursoServices {

    public List<Curso> listar();

    public String insert(Curso atributo);

    public String update(Curso atributo);

    public Curso get(Integer atributo_id);

}
