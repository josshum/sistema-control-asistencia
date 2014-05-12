package pe.com.controlasistencia.services;

import java.util.List;

import pe.com.controlasistencia.entities.Interfaz;

public interface InterfazServices {
	
	public List<Interfaz> listar();
    public String insert(Interfaz atributo);
    public String update(Interfaz atributo);
    public Interfaz get(Integer atributo_id);


}
