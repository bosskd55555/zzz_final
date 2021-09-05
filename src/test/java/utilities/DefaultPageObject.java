package utilities;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.thucydides.core.pages.PageObject;

public class DefaultPageObject extends PageObject {

    public static Logger logger=LogManager.getLogger(DefaultPageObject.class);
    public static Properties prop;
    

    public DefaultPageObject() {
    	
    	//setImplicitTimeout(10,SECONDS);

        prop = new Properties();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("config.properties");
        try {
			prop.load(inputStream);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     
        
    }

 
   



}
