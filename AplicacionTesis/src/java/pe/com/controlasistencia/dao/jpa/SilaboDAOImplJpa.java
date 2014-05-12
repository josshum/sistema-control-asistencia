/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.controlasistencia.dao.jpa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.apache.log4j.Logger;
import pe.calvarado.gestion.util.messages.UIMessages;
import pe.com.controlasistencia.dao.SilaboDAO;
import pe.com.controlasistencia.entities.Silabo;
import pe.com.controlasistencia.util.JPAUtil;

/**
 *
 * @author tigabytes-linux
 */
public class SilaboDAOImplJpa implements SilaboDAO {

    private EntityManager em;
    private static Logger log = Logger.getLogger(SilaboDAOImplJpa.class);

    public SilaboDAOImplJpa() {
        this.em = JPAUtil.getEntityManager();
    }

    @Override
    public List<Silabo> listar() {
        TypedQuery<Silabo> query = em.createQuery("select c From Silabo", Silabo.class);
        return query.getResultList();
    }

    @Override
    public String insert(Silabo atributo) {
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
    public String update(Silabo atributo) {
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
    public Silabo get(Integer atributo_id) {
        if (!em.isOpen()) {
            em = JPAUtil.getEntityManager();
        }
        return em.find(Silabo.class, atributo_id);
    }

}
