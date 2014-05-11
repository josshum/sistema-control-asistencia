package pe.com.controlasistencia.services.impl;

import java.util.List;
import pe.com.controlasistencia.dao.UsuarioDAO;
import pe.com.controlasistencia.entities.Usuario;
import pe.com.controlasistencia.services.UsuarioServices;

public class UsuarioServicesImpl implements UsuarioServices {

    UsuarioDAO usuarioDao;

    public void setUbigeoDao(UsuarioDAO usuarioDao) {
        this.usuarioDao = usuarioDao;
    }

    @Override
    public List<Usuario> listar() {
        return usuarioDao.listar();
    }

    @Override
    public String insert(Usuario atributo) {
        return usuarioDao.insert(atributo);
    }

    @Override
    public String update(Usuario atributo) {
        return usuarioDao.update(atributo);
    }

    @Override
    public Usuario get(Integer atributo_id) {
        return usuarioDao.get(atributo_id);
    }

}
