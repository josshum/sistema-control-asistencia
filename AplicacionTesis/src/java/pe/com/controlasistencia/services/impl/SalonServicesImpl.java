package pe.com.controlasistencia.services.impl;

import java.util.List;
import pe.com.controlasistencia.dao.SalonDAO;
import pe.com.controlasistencia.entities.Salon;
import pe.com.controlasistencia.services.SalonServices;

public class SalonServicesImpl implements SalonServices {

    SalonDAO salonDao;

    public void setSalonDao(SalonDAO salonDao) {
        this.salonDao = salonDao;
    }

    @Override
    public List<Salon> listar() {
        return salonDao.listar();
    }

    @Override
    public String insert(Salon atributo) {
        return salonDao.insert(atributo);
    }

    @Override
    public String update(Salon atributo) {
        return salonDao.update(atributo);
    }

    @Override
    public Salon get(Integer atributo_id) {
        return salonDao.get(atributo_id);
    }

}
