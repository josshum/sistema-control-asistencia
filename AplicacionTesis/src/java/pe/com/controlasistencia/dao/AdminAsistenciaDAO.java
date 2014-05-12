package pe.com.controlasistencia.dao;

import java.util.List;

import pe.com.controlasistencia.entities.AdminAsistencia;

public interface AdminAsistenciaDAO {
	
     public List<AdminAsistencia> listar();
     public String insert(AdminAsistencia atributo);
     public String update(AdminAsistencia atributo);
     public AdminAsistencia get(Integer atributo_id);
}
