package pe.com.controlasistencia.services.impl;

import java.util.List;
import pe.com.controlasistencia.dao.AdminAsistenciaDAO;
import pe.com.controlasistencia.entities.AdminAsistencia;
import pe.com.controlasistencia.services.AdminAsistenciaServices;

public class AdminAsistenciaServicesImpl implements AdminAsistenciaServices{
    
    AdminAsistenciaDAO adminasistenciaDao;

    public void setAdminAsistenciaDao(AdminAsistenciaDAO adminasistenciaDao) {
        this.adminasistenciaDao = adminasistenciaDao;
    }
    

	@Override
	public List<AdminAsistencia> listar() {
		return adminasistenciaDao.listar();
	}

	@Override
	public String insert(AdminAsistencia atributo) {
		return adminasistenciaDao.insert(atributo);
	}

	@Override
	public String update(AdminAsistencia atributo) {
		return adminasistenciaDao.update(atributo);
	}

	@Override
	public AdminAsistencia get(Integer atributo_id) {
		return adminasistenciaDao.get(atributo_id);
	}

}
