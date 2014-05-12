package pe.com.controlasistencia.services.impl;

import java.util.List;
import pe.com.controlasistencia.dao.TipoSalonDAO;
import pe.com.controlasistencia.entities.Tiposalon;
import pe.com.controlasistencia.services.TipoSalonServices;

public class TipoSalonServicesImpl implements TipoSalonServices {

    TipoSalonDAO tiposalonDao;

    public void setTipoSalonDao(TipoSalonDAO tiposalonDao) {
        this.tiposalonDao = tiposalonDao;
    }

    @Override
    public List<Tiposalon> listar() {
        return tiposalonDao.listar();
    }

    @Override
    public String insert(Tiposalon atributo) {
        return tiposalonDao.insert(atributo);
    }

    @Override
    public String update(Tiposalon atributo) {
        return tiposalonDao.update(atributo);
    }

    @Override
    public Tiposalon get(Integer atributo_id) {
        return tiposalonDao.get(atributo_id);
    }

}
