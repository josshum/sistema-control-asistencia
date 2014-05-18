package pe.com.controlasistencia.services.impl;

import java.util.List;
import pe.com.controlasistencia.dao.AuditoriaDAO;
import pe.com.controlasistencia.entities.Auditoria;
import pe.com.controlasistencia.services.AuditoriaServices;

public class AuditoriaServicesImpl implements AuditoriaServices{

    AuditoriaDAO auditoriaDao;

    public void setAuditoriaDao(AuditoriaDAO auditoriaDao) {
        this.auditoriaDao = auditoriaDao;
    }
    
	@Override
	public List<Auditoria> listar() {
            return auditoriaDao.listar();
	}

	@Override
	public String insert(Auditoria atributo) {
            return auditoriaDao.insert(atributo);
	}

	@Override
	public String update(Auditoria atributo) {
            return auditoriaDao.update(atributo);
	}

	@Override
	public Auditoria get(Integer atributo_id) {
            return auditoriaDao.get(atributo_id);
        }

}
