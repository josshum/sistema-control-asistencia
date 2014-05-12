package pe.com.controlasistencia.services;

import java.util.List;

import pe.com.controlasistencia.entities.Tiposalon;

public interface TipoSalonServices {
	
	public List<Tiposalon> listar();
    public String insert(Tiposalon atributo);
    public String update(Tiposalon atributo);
    public Tiposalon get(Integer atributo_id);

}
