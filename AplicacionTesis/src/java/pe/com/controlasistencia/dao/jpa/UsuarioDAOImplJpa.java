package pe.com.controlasistencia.dao.jpa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import org.apache.log4j.Logger;
import pe.calvarado.gestion.util.messages.UIMessages;
import pe.com.controlasistencia.dao.UsuarioDAO;
import pe.com.controlasistencia.entities.Usuario;
import pe.com.controlasistencia.util.JPAUtil;

public class UsuarioDAOImplJpa implements UsuarioDAO {

    private EntityManager em;
    private static Logger log = Logger.getLogger(UsuarioDAOImplJpa.class);

    public UsuarioDAOImplJpa() {
        this.em = JPAUtil.getEntityManager();
    }

    @Override
    public List<Usuario> listar() {
        TypedQuery<Usuario> query = em.createQuery("select c From Usuario", Usuario.class);
        return query.getResultList();
    }

    @Override
    public String insert(Usuario atributo) {
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
    public String update(Usuario atributo) {
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
    public Usuario get(Integer usuarioId) {
        if (!em.isOpen()) {
            em = JPAUtil.getEntityManager();
        }
        return em.find(Usuario.class, usuarioId);
    }

    @Override
    public Usuario validarUsuario(String usuario, String clave) {
        log.info("Validando usuario...");
        try {

            if (em.isOpen()) {
                log.info("Conexion abierta");
            } else {
                log.info("Conexion cerrada");
            }

            Query query = em.createQuery("SELECT u FROM Usuario u WHERE u.logonid = :login AND u.passwrd = :clave");
            query.setParameter("login", usuario);
            query.setParameter("clave", clave);
            return (Usuario) query.getSingleResult();
        } catch (NoResultException ex) {
            log.error(ex.getMessage());
            return null;
        }

    }

}
