package pe.com.controlasistencia.dao;

import java.util.List;

import pe.com.controlasistencia.entities.Usuario;

public interface UsuarioDAO {
	
	public List<Usuario> listar();
    public String insert(Usuario atributo);
    public String update(Usuario atributo);
    public Usuario get(Integer atributo_id);


}
