package pe.com.controlasistencia.dao;

import java.util.List;

import pe.com.controlasistencia.entities.Salon;

public interface SalonDAO {
	
	public List<Salon> listar();
    public String insert(Salon atributo);
    public String update(Salon atributo);
    public Salon get(Integer atributo_id);

}
