package pe.com.controlasistencia.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringUtils {
    
   private static ApplicationContext applicationContext = 
                  new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");

   public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
   
    
    public static Object getBean(String bean_name){
    
        return applicationContext.getBean(bean_name);
        
       
    }
    
}
