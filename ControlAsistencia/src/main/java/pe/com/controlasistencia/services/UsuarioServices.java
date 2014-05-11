package pe.com.controlasistencia.services;

import java.util.List;

import pe.com.controlasistencia.entities.Usuario;

public interface UsuarioServices {
	
	public List<Usuario> listar();
    public String insert(Usuario atributo);
    public String update(Usuario atributo);
    public Usuario get(Integer atributo_id);

}
