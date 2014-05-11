package pe.com.controlasistencia.services;

import java.util.List;

import pe.com.controlasistencia.entities.Auditoria;

public interface AuditoriaServices {
	
	public List<Auditoria> listar();
    public String insert(Auditoria atributo);
    public String update(Auditoria atributo);
    public Auditoria get(Integer atributo_id);

}
