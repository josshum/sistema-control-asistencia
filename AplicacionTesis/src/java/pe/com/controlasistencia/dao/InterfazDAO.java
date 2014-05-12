package pe.com.controlasistencia.dao;

import java.util.List;

import pe.com.controlasistencia.entities.Interfaz;

public interface InterfazDAO {
	
	public List<Interfaz> listar();
    public String insert(Interfaz atributo);
    public String update(Interfaz atributo);
    public Interfaz get(Integer atributo_id);

}
