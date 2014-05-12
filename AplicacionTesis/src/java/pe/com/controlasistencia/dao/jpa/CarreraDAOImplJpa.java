package pe.com.controlasistencia.dao.jpa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.apache.log4j.Logger;
import pe.calvarado.gestion.util.messages.UIMessages;
import pe.com.controlasistencia.dao.CarreraDAO;
import pe.com.controlasistencia.entities.Carrera;
import pe.com.controlasistencia.util.JPAUtil;

public class CarreraDAOImplJpa implements CarreraDAO {

    private EntityManager em;
    private static Logger log = Logger.getLogger(CarreraDAOImplJpa.class);

    public CarreraDAOImplJpa() {
        this.em = JPAUtil.getEntityManager();
    }

    @Override
    public List<Carrera> listar() {
        TypedQuery<Carrera> query = em.createQuery("select c From Carrera", Carrera.class);
        return query.getResultList();
    }

    @Override
    public String insert(Carrera atributo) {
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
    public String update(Carrera atributo) {
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
    public Carrera get(Integer atributo_id) {
        if (!em.isOpen()) {
            em = JPAUtil.getEntityManager();
        }
        return em.find(Carrera.class, atributo_id);
    }

}
