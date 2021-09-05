package stepDefinitions;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import net.serenitybdd.core.pages.PageObject;
import utilities.DefaultPageObject;

public class Hooks extends PageObject{
	
	 public static Logger logger;
	
//	@Before(order=1)
//    public void beforeScenario() throws InterruptedException{
//		
//		logger.info("Enters the method-open URL");
//        //prop=loadThePropertiesFile();
//        Thread.sleep(4000);
//        open();
//        //getDriver().get(DefaultPageObject.prop.getProperty("baseURL"));
//        logger.info("URL opened");
//        //getDriver().manage().timeouts().implicitlyWait(20, SECONDS);
//        getDriver().manage().window().maximize();
//        Thread.sleep(9000);
//    }
	
	
	@Before(order=0)
    public void beforeScenarioStart() throws IOException{
		   
		logger=LogManager.getLogger();
		DefaultPageObject readconfig=new DefaultPageObject();
		 logger.info("Log and config properties are initialized");
		
    }	
	
	
/*	@After(order=0)
    public void afterScenarioFinish() throws InterruptedException{
      
		Thread.sleep(5000);
    	
	    WebElement Logout_link=getDriver().findElement(By.xpath("//*[@id='top-header-menu']/div[3]/div[2]/div/i"));	
	    	Logout_link.click();
	    	
	    	Thread.sleep(2000);
	    	
	    	WebElement Logout=getDriver().findElement(By.xpath("//*[@id='top-header-menu']/div[3]/div[2]/div/div/a[5]/span"));
	    	Logout.click();;
	    	
	    	logger.info("Logout from the scenario");
	    	Thread.sleep(5000);
		
    }	
	*/



}
