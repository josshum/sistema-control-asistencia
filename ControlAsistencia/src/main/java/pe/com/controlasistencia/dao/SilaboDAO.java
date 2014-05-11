package pe.com.controlasistencia.dao;

import java.util.List;

import pe.com.controlasistencia.entities.Silabo;

public interface SilaboDAO {
	
	public List<Silabo> listar();
    public String insert(Silabo atributo);
    public String update(Silabo atributo);
    public Silabo get(Integer atributo_id);

}
