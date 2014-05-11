package pe.com.controlasistencia.services.impl;

import java.util.List;
import pe.com.controlasistencia.dao.TurnoDAO;
import pe.com.controlasistencia.entities.Turno;
import pe.com.controlasistencia.services.TurnoServices;

public class TurnoServicesImpl implements TurnoServices {

    TurnoDAO turnoDao;

    public void setTurnoDao(TurnoDAO turnoDao) {
        this.turnoDao = turnoDao;
    }

    @Override
    public List<Turno> listar() {
        return turnoDao.listar();
    }

    @Override
    public String insert(Turno atributo) {
        return turnoDao.insert(atributo);
    }

    @Override
    public String update(Turno atributo) {
        return turnoDao.update(atributo);
    }

    @Override
    public Turno get(Integer atributo_id) {
        return turnoDao.get(atributo_id);
    }

}
