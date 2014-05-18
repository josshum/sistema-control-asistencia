package pe.com.controlasistencia.services.impl;

import java.util.List;
import pe.com.controlasistencia.dao.CursoDAO;
import pe.com.controlasistencia.entities.Curso;
import pe.com.controlasistencia.services.CursoServices;

public class CursoServicesImpl implements CursoServices {

    CursoDAO cursoDao;

    public void setCursoDao(CursoDAO cursoDao) {
        this.cursoDao = cursoDao;
    }

   

    @Override
    public String insert(Curso atributo) {
        return cursoDao.insert(atributo);
    }

    @Override
    public String update(Curso atributo) {
        return cursoDao.update(atributo);
    }

    @Override
    public Curso get(Integer atributo_id) {
        return cursoDao.get(atributo_id);
    }

    @Override
    public List<Curso> listar() {
        return cursoDao.listar();
    }

}
