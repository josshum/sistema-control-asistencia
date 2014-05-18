package pe.com.controlasistencia.services.impl;

import java.util.List;
import pe.com.controlasistencia.dao.ClaseDAO;
import pe.com.controlasistencia.entities.Clase;
import pe.com.controlasistencia.services.ClaseServices;

public class ClaseServicesImpl implements ClaseServices {

    ClaseDAO claseDao;

    public void setClaseDao(ClaseDAO claseDao) {
        this.claseDao = claseDao;
    }

    @Override
    public List<Clase> listar() {
       return claseDao.listar();
    }

    @Override
    public String insert(Clase atributo) {
       return claseDao.insert(atributo);
    }

    @Override
    public String update(Clase atributo) {
        return claseDao.update(atributo);
    }

    @Override
    public Clase get(Integer atributo_id) {
        return claseDao.get(atributo_id);
    }

}
