package pe.com.controlasistencia.services.impl;

import java.util.List;
import pe.com.controlasistencia.dao.TipoSalonDAO;
import pe.com.controlasistencia.entities.Tiposalon;
import pe.com.controlasistencia.services.TipoSalonServices;

public class TipoSalonServicesImpl implements TipoSalonServices {

    TipoSalonDAO tipoSalonDao;

    public void setTipoSalonDao(TipoSalonDAO tipoSalonDao) {
        this.tipoSalonDao = tipoSalonDao;
    }

    @Override
    public List<Tiposalon> listar() {
        return tipoSalonDao.listar();
    }

    @Override
    public String insert(Tiposalon atributo) {
        return tipoSalonDao.insert(atributo);
    }

    @Override
    public String update(Tiposalon atributo) {
        return tipoSalonDao.update(atributo);
    }

    @Override
    public Tiposalon get(Integer atributo_id) {
        return tipoSalonDao.get(atributo_id);
    }

}
