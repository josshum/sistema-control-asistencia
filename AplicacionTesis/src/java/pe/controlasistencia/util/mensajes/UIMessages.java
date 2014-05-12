/*
Clase que lee los properties de mensajes y devuelve el mensaje
 */
package pe.calvarado.gestion.util.messages;

import java.io.InputStream;
import java.util.Properties;
import org.apache.log4j.Logger;

public class UIMessages {
    
        private static final String ERROR_MESSAGES_PROPERTIES_FILE      = "gestionAppErrorMessages.properties";
        private static final String INFO_MESSAGES_PROPERTIES_FILE       = "gestionAppInfoMessages.properties";
        private static final String QUESTION_MESSAGES_PROPERTIES_FILE   = "gestionAppQuestionMessages.properties";
        private static Logger log = Logger.getLogger(UIMessages.class);
    
    public static String getErrorMessage(String key){
        
            String errorMessage = null;
            Properties properties = new Properties();
            InputStream in = UIMessages.class.getResourceAsStream(ERROR_MESSAGES_PROPERTIES_FILE);
            try {
                properties.load(in);
                errorMessage = properties.getProperty(key);
            } catch (Exception ex) {
                log.info("Error al cargar ErrorMessages properties");
                log.error(ex.getMessage());             
            }
        
            return errorMessage;
    }
    
    
    public static String getInfoMessage(String key){
        
            String errorMessage = null;
            Properties properties = new Properties();
            InputStream in = UIMessages.class.getResourceAsStream(INFO_MESSAGES_PROPERTIES_FILE);
            try {
                properties.load(in);
                errorMessage = properties.getProperty(key);
            } catch (Exception ex) {
                log.info("Error al cargar InfoMessages properties");
                log.error(ex.getMessage());             
            }
        return errorMessage;
    }
    
    public static String getQuestionMessage(String key){
        
        String errorMessage = null;
            Properties properties = new Properties();
            InputStream in = UIMessages.class.getResourceAsStream(QUESTION_MESSAGES_PROPERTIES_FILE);
            try {
           
            properties.load(in);
            errorMessage = properties.getProperty(key);
            
            } catch (Exception ex) {
                log.info("Error al cargar QuestionMessages properties");
                log.error(ex.getMessage());             
            }
        
        return errorMessage;
        
    
    }
    
    
}
