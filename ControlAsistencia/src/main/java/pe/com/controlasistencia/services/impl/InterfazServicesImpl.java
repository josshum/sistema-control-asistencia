package pe.com.controlasistencia.services.impl;

import java.util.List;
import pe.com.controlasistencia.dao.InterfazDAO;
import pe.com.controlasistencia.entities.Interfaz;
import pe.com.controlasistencia.services.InterfazServices;

public class InterfazServicesImpl implements InterfazServices{

    InterfazDAO interfazDao;

    public void setAdminAsistenciaDao(InterfazDAO interfazDao) {
        this.interfazDao = interfazDao;
    }
    
	@Override
	public List<Interfaz> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String insert(Interfaz atributo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String update(Interfaz atributo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Interfaz get(Integer atributo_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
