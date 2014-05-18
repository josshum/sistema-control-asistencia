package pe.com.controlasistencia.services.impl;

import java.util.List;
import pe.com.controlasistencia.dao.PerfilDAO;
import pe.com.controlasistencia.entities.Perfil;
import pe.com.controlasistencia.services.PerfilServices;

public class PerfilServicesImpl implements PerfilServices {

    PerfilDAO perfilDao;

    public void setPerfilDao(PerfilDAO perfilDao) {
        this.perfilDao = perfilDao;
    }

    @Override
    public List<Perfil> listar() {
        return perfilDao.listar();
    }

    @Override
    public String insert(Perfil atributo) {
        return perfilDao.insert(atributo);
    }

    @Override
    public String update(Perfil atributo) {
        return perfilDao.update(atributo);
    }

    @Override
    public Perfil get(Integer atributo_id) {
        return perfilDao.get(atributo_id);
    }

}
