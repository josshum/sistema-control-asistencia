package pe.com.controlasistencia.services;

import java.util.List;

import pe.com.controlasistencia.entities.Turno;

public interface TurnoServices {
	
	public List<Turno> listar();
    public String insert(Turno atributo);
    public String update(Turno atributo);
    public Turno get(Integer atributo_id);

}
