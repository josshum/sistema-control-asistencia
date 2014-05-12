package pe.com.controlasistencia.dao.jpa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.apache.log4j.Logger;
import pe.calvarado.gestion.util.messages.UIMessages;
import pe.com.controlasistencia.dao.AuditoriaDAO;
import pe.com.controlasistencia.entities.Auditoria;
import pe.com.controlasistencia.util.JPAUtil;

public class AuditoriaDAOImplJpa implements AuditoriaDAO {

    private EntityManager em;
    private static Logger log = Logger.getLogger(AuditoriaDAOImplJpa.class);

    public AuditoriaDAOImplJpa() {
        this.em = JPAUtil.getEntityManager();
    }

    @Override
    public List<Auditoria> listar() {
        TypedQuery<Auditoria> query = em.createQuery("select c From Auditoria", Auditoria.class);
        return query.getResultList();
    }

    @Override
    public String insert(Auditoria atributo) {
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
    public String update(Auditoria atributo) {
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
    public Auditoria get(Integer atributo_id) {
        if (!em.isOpen()) {
            em = JPAUtil.getEntityManager();
        }
        return em.find(Auditoria.class, atributo_id);
    }

}
