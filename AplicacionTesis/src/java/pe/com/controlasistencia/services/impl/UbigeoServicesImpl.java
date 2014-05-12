package pe.com.controlasistencia.services.impl;

import java.util.List;
import pe.com.controlasistencia.dao.UbigeoDAO;
import pe.com.controlasistencia.entities.Ubigeo;
import pe.com.controlasistencia.services.UbigeoServices;

public class UbigeoServicesImpl implements UbigeoServices {

    UbigeoDAO ubigeoDao;

    public void setUbigeoDao(UbigeoDAO ubigeoDao) {
        this.ubigeoDao = ubigeoDao;
    }

    @Override
    public List<Ubigeo> listar() {
        return ubigeoDao.listar();
    }

    @Override
    public String insert(Ubigeo atributo) {
       return ubigeoDao.insert(atributo);
    }

    @Override
    public String update(Ubigeo atributo) {
        return ubigeoDao.update(atributo);
    }

    @Override
    public Ubigeo get(Integer atributo_id) {
        return ubigeoDao.get(atributo_id);
    }

}
