package pe.com.controlasistencia.services;

import java.util.List;

import pe.com.controlasistencia.entities.Ubigeo;

public interface UbigeoServices {
	
	public List<Ubigeo> listar();
    public String insert(Ubigeo atributo);
    public String update(Ubigeo atributo);
    public Ubigeo get(Integer atributo_id);

}
