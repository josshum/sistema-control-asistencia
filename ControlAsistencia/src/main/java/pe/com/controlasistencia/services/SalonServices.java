package pe.com.controlasistencia.services;

import java.util.List;

import pe.com.controlasistencia.entities.Salon;

public interface SalonServices {
	
	public List<Salon> listar();
    public String insert(Salon atributo);
    public String update(Salon atributo);
    public Salon get(Integer atributo_id);
}
