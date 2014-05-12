package pe.com.controlasistencia.util;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.apache.log4j.Logger;

public class JPAUtil implements Serializable{
    
    
        private static Logger log   = Logger.getLogger(JPAUtil.class);
	private static EntityManagerFactory factory;
	   
        static{
        log.info("Creando EntityManagerFactory...");
        factory = Persistence.createEntityManagerFactory("ControlDeAsistenciaPU");
    }

    /**
     * Retorna EntityManager
     */
    public static EntityManager getEntityManager(){
       try{
            log.info("Creando EntityManager...");
            return factory.createEntityManager();
       }catch(Exception ex){
            log.error(ex.getMessage());
            return null;
       }
    }

    
    public static void closeEntityManager(EntityManager em){
    	
                try{
                        em.close();
                    }catch(Exception ex){
                       log.error(ex.getMessage()); 
                    }	
 		}
    

}
