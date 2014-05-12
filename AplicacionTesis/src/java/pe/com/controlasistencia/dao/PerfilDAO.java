package pe.com.controlasistencia.dao;

import java.util.List;

import pe.com.controlasistencia.entities.Perfil;

public interface PerfilDAO {
	
	public List<Perfil> listar();
    public String insert(Perfil atributo);
    public String update(Perfil atributo);
    public Perfil get(Integer atributo_id);

}
