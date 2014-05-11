package pe.com.controlasistencia.dao.jpa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.apache.log4j.Logger;
import pe.calvarado.gestion.util.messages.UIMessages;
import pe.com.controlasistencia.dao.ClaseRecursoDAO;
import pe.com.controlasistencia.entities.ClaseRecurso;
import pe.com.controlasistencia.util.JPAUtil;

public class ClaseRecursoDAOImplJpa implements ClaseRecursoDAO {

    private EntityManager em;
    private static Logger log = Logger.getLogger(ClaseRecursoDAOImplJpa.class);

    public ClaseRecursoDAOImplJpa() {
        this.em = JPAUtil.getEntityManager();
    }

    @Override
    public List<ClaseRecurso> listar() {
        TypedQuery<ClaseRecurso> query = em.createQuery("select c From ClaseRecurso", ClaseRecurso.class);
        return query.getResultList();
    }

    @Override
    public String insert(ClaseRecurso atributo) {
        String resultado = null;
        if (!em.isOpen()) {
            em = JPAUtil.getEntityManager();
        }
        try {
            em.getTransaction().begin();
            em.persist(atributo);
            em.getTransaction().commit();
            resultado = UIMessages.getInfoMessage("onCompleteInsert");
            log.info("Insertando atributo");
        } catch (Exception ex) {
            log.error(ex.getMessage());
            em.getTransaction().rollback();
        } finally {
            em.close();
            return resultado;
        }
    }

    @Override
    public String update(ClaseRecurso atributo) {
        String mensaje = null;
        log.trace("Actualizando atributo...");
        if (!em.isOpen()) {
            em = JPAUtil.getEntityManager();
        }

        try {
            em.getTransaction().begin();
            em.merge(atributo);
            em.getTransaction().commit();
            mensaje = UIMessages.getInfoMessage("onCompleteUpdate");
            log.info(UIMessages.getInfoMessage("onCompleteUpdate"));
        } catch (Exception ex) {
            em.getTransaction().rollback();
            log.error("Error al actualizar atributo...");
        }

        return mensaje;
    }

    @Override
    public ClaseRecurso get(Integer atributo_id) {
        if (!em.isOpen()) {
            em = JPAUtil.getEntityManager();
        }
        return em.find(ClaseRecurso.class, atributo_id);
    }

}
