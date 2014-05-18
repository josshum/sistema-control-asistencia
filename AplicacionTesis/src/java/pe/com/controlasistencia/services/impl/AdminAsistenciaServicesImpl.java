package pe.com.controlasistencia.services.impl;

import java.util.List;
import pe.com.controlasistencia.dao.AdminAsistenciaDAO;
import pe.com.controlasistencia.entities.AdminAsistencia;
import pe.com.controlasistencia.services.AdminAsistenciaServices;

public class AdminAsistenciaServicesImpl implements AdminAsistenciaServices{
    
    AdminAsistenciaDAO adminAsistenciaDao;

    public void setAdminAsistenciaDao(AdminAsistenciaDAO adminAsistenciaDao) {
        this.adminAsistenciaDao = adminAsistenciaDao;
    }
    

	@Override
	public List<AdminAsistencia> listar() {
		return adminAsistenciaDao.listar();
	}

	@Override
	public String insert(AdminAsistencia atributo) {
		return adminAsistenciaDao.insert(atributo);
	}

	@Override
	public String update(AdminAsistencia atributo) {
		return adminAsistenciaDao.update(atributo);
	}

	@Override
	public AdminAsistencia get(Integer atributo_id) {
		return adminAsistenciaDao.get(atributo_id);
	}

}
