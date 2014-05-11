package pe.com.controlasistencia.services.impl;

import java.util.List;
import pe.com.controlasistencia.dao.ClaseRecursoDAO;
import pe.com.controlasistencia.entities.ClaseRecurso;
import pe.com.controlasistencia.services.ClaseRecursoServices;

public class ClaseRecursoServicesImpl implements ClaseRecursoServices {

    ClaseRecursoDAO claserecursoDao;

    public void setAdminAsistenciaDao(ClaseRecursoDAO claserecursoDao) {
        this.claserecursoDao = claserecursoDao;
    }

    @Override
    public List<ClaseRecurso> listar() {
        return claserecursoDao.listar();
    }

    @Override
    public String insert(ClaseRecurso atributo) {
        return claserecursoDao.insert(atributo);
    }

    @Override
    public String update(ClaseRecurso atributo) {
        return claserecursoDao.update(atributo);
    }

    @Override
    public ClaseRecurso get(Integer atributo_id) {
        return claserecursoDao.get(atributo_id);
    }

}
