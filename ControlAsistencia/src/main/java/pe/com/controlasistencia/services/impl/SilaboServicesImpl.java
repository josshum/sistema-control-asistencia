package pe.com.controlasistencia.services.impl;

import java.util.List;
import pe.com.controlasistencia.dao.SilaboDAO;
import pe.com.controlasistencia.entities.Silabo;
import pe.com.controlasistencia.services.SilaboServices;

public class SilaboServicesImpl implements SilaboServices {

    SilaboDAO silaboDao;

    public void setSilaboDao(SilaboDAO silaboDao) {
        this.silaboDao = silaboDao;
    }

    @Override
    public List<Silabo> listar() {
        return silaboDao.listar();
    }

    @Override
    public String insert(Silabo atributo) {
        return silaboDao.insert(atributo);
    }

    @Override
    public String update(Silabo atributo) {
        return silaboDao.update(atributo);
    }

    @Override
    public Silabo get(Integer atributo_id) {
        return silaboDao.get(atributo_id);
    }

}
