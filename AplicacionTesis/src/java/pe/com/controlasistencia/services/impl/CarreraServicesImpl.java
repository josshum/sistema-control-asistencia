package pe.com.controlasistencia.services.impl;

import java.util.List;
import pe.com.controlasistencia.dao.CarreraDAO;
import pe.com.controlasistencia.entities.Carrera;
import pe.com.controlasistencia.services.CarreraServices;

public class CarreraServicesImpl implements CarreraServices{

    CarreraDAO carreraDao;

    public void setAdminAsistenciaDao(CarreraDAO carreraDao) {
        this.carreraDao = carreraDao;
    }
    
    
	@Override
	public List<Carrera> listar() {
            return carreraDao.listar();
	}

	@Override
	public String insert(Carrera atributo) {
            return carreraDao.insert(atributo);
	}

	@Override
	public String update(Carrera atributo) {
            return carreraDao.update(atributo);
	}

	@Override
	public Carrera get(Integer atributo_id) {
            return carreraDao.get(atributo_id);
	}

}
