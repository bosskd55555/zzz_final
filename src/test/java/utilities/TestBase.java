package utilities;

import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import net.serenitybdd.core.pages.PageObject;


public class TestBase extends PageObject{

    public static WebDriver driver;
    public static WebDriver bak_chrome;
    public static WebDriver bak_firefox;
    public static WebDriver bak_IE;
    public static Properties pro;
    public static Logger logger;

/*    public TestBase() {

        logger = LogManager.getLogger();
//File src=new File("./Configuration/config.properties");

        File src = new File("C:\\Users\\Smart\\eclipse-workspace\\Framework\\src\\test\\resources\\config.properties");


        try {
            FileInputStream fis = new FileInputStream(src);
            pro = new Properties();
            pro.load(fis);
            logger.info("Property file loaded");
        } catch (Exception e) {

            System.out.println("Exception is" + e.getMessage());

        }

    }*/


    
    @Before
    public void LaunchTheHomeUrl() throws Exception{

    	
    	
    	logger.info("Enters the method-open URL");
        //prop=loadThePropertiesFile();
        Thread.sleep(4000);
       // getDriver().get(DefaultPageObject.prop.getProperty("baseURL"));
        logger.info("URL opened");
        //getDriver().manage().timeouts().implicitlyWait(20, SECONDS);
        getDriver().manage().window().maximize();
        Thread.sleep(500);
    }

    @After
public void logoutApplication () throws InterruptedException{
    	
    	Thread.sleep(3000);
    	
    WebElement Logout_link=getDriver().findElement(By.xpath("//*[@id='top-header-menu']/div[3]/div[2]/div/i"));	
    	Logout_link.click();
    	
    	Thread.sleep(2000);
    	
    	WebElement Logout=getDriver().findElement(By.xpath("//*[@id='top-header-menu']/div[3]/div[2]/div/div/a[5]/span"));
    	Logout.click();;
    	
    	
    }


}
