package pe.com.controlasistencia.services.impl;

import java.util.List;
import pe.com.controlasistencia.dao.ClaseRecursoDAO;
import pe.com.controlasistencia.entities.ClaseRecurso;
import pe.com.controlasistencia.services.ClaseRecursoServices;

public class ClaseRecursoServicesImpl implements ClaseRecursoServices {

    ClaseRecursoDAO claseRecursoDao;

    public void setClaseRecursoDao(ClaseRecursoDAO claseRecursoDao) {
        this.claseRecursoDao = claseRecursoDao;
    }

    @Override
    public List<ClaseRecurso> listar() {
        return claseRecursoDao.listar();
    }

    @Override
    public String insert(ClaseRecurso atributo) {
        return claseRecursoDao.insert(atributo);
    }

    @Override
    public String update(ClaseRecurso atributo) {
        return claseRecursoDao.update(atributo);
    }

    @Override
    public ClaseRecurso get(Integer atributo_id) {
        return claseRecursoDao.get(atributo_id);
    }

}
