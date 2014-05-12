package pe.com.controlasistencia.services.impl;

import java.util.List;
import pe.com.controlasistencia.dao.PermisoDAO;
import pe.com.controlasistencia.entities.Permiso;
import pe.com.controlasistencia.services.PermisoServices;

public class PermisoServicesImpl implements PermisoServices {

    PermisoDAO permisoDao;

    public void setAdminAsistenciaDao(PermisoDAO permisoDao) {
        this.permisoDao = permisoDao;
    }

    @Override
    public List<Permiso> listar() {
        return permisoDao.listar();
    }

    @Override
    public String insert(Permiso atributo) {
        return permisoDao.insert(atributo);
    }

    @Override
    public String update(Permiso atributo) {
        return permisoDao.update(atributo);
    }

    @Override
    public Permiso get(Integer atributo_id) {
        return permisoDao.get(atributo_id);
    }

}
