package pe.com.controlasistencia.services.impl;

import java.util.List;
import pe.com.controlasistencia.dao.RecursoDAO;
import pe.com.controlasistencia.entities.Recurso;
import pe.com.controlasistencia.services.RecursoServices;

public class RecursoServicesImpl implements RecursoServices {

    RecursoDAO recursoDao;

    public void setRecursoDao(RecursoDAO recursoDao) {
        this.recursoDao = recursoDao;
    }

    @Override
    public List<Recurso> listar() {
        return recursoDao.listar();
    }

    @Override
    public String insert(Recurso atributo) {
        return recursoDao.insert(atributo);
    }

    @Override
    public String update(Recurso atributo) {
        return recursoDao.update(atributo);
    }

    @Override
    public Recurso get(Integer atributo_id) {
        return recursoDao.get(atributo_id);
    }

}
