package pe.com.controlasistencia.dao;

import java.util.List;

import pe.com.controlasistencia.entities.Turno;

public interface TurnoDAO {
	
	public List<Turno> listar();
    public String insert(Turno atributo);
    public String update(Turno atributo);
    public Turno get(Integer atributo_id);

}
