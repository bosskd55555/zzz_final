package pageObjects;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
//import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import utilities.DefaultPageObject;

public class DealsPageObject extends DefaultPageObject {
	
	// Properties prop = new Properties();
	
	 

	
	@FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[2]/div/a[3]/button")
	 @CacheLookup	
	 private WebElementFacade new_button;


		@FindBy(name="title")
		private WebElementFacade deals_title;
		
		
		@FindBy(name="amount")
		private WebElementFacade deals_amount;
		
		@FindBy(name="probability")
		private WebElementFacade deals_probability;


		@FindBy(name="commission")
		private WebElementFacade deals_commision;
		
		
		@FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")
		private WebElementFacade deals_save_button;
	 

		 public void Enter_the_deals_page() throws Exception{

			// Thread.sleep(3000);
		      //prop=loadThePropertiesFile();
		      
		     
		      //Thread.sleep(3500);
		     
		        
		      
		      //  getDriver().manage().timeouts().implicitlyWait(20, SECONDS);
		      logger.info("before new button clicked"); 
		      
		     
		    //if(waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/a[3]/button")).);
		      //withTimeoutOf(10,TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".mjHome")));   
		    	 // System.out.println("webelement is"+abc); 
		      
		 //     withTimeoutOf(Duration.ofSeconds(70)).find(By.xpath("//a[@href='/deals/new']"))
           //   .click();

		     
		      //waitForCondition().withTimeout(Duration.ofSeconds(10)).pollingEvery(5, TimeUnit.SECONDS).until(ExpectedConditions.elementToBeClickable(new_button));
		      
		 
		    		 
		      new_button.click();
		    		 
		  //    withTimeoutOf(Duration.ofSeconds(70)).find(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[1]"))
            //  .click(); 
		      
		    
		     // webDriver.findElement(By.xpath("//a[@href='/deals/new']")).click();
		      
		     
		     // new_button.click();
		      
		        logger.info("after new button clicked");
		        
		       // Thread.sleep(3500);
		      
		        
		       // new_button.waitUntilEnabled();
		        //new_button.waitUntilVisible();
		      
		        
		        
		        
		     //  WebElement test= getDriver().findElement(By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/a[3]/button"));
		       
		     //  Thread.sleep(3500);
		       
		      //test.click();
		        
		        logger.info(" after new button clicked");
		        
		       // Thread.sleep(1500);
		    }
	 
	 public void Enter_the_deals_details() throws Exception{

	    //   prop=loadThePropertiesFile();
		 
		 
	     
	        deals_title.sendKeys(prop.getProperty("title")); 
	        
	      //  waitForCondition().withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(5)).until
	        
	       // waitForCondition().withTimeout(Duration.ofSeconds(10)).pollingEvery(5, TimeUnit.SECONDS).until(ExpectedConditions.elementToBeClickable(By.name("amount")));
	        deals_amount.sendKeys(prop.getProperty("amount"));
	        deals_probability.sendKeys(prop.getProperty("probability"));
	        deals_commision.sendKeys(prop.getProperty("Commission"));
	        logger.info("Deals values entered");
	        deals_save_button.click();
	       // getDriver().manage().timeouts().implicitlyWait(20, SECONDS);
	        Thread.sleep(500);
	    }
	 
	 public void Enter_the_deals_datatable(String title, String amount, String probability, String commision) throws Exception{

	      // prop=loadThePropertiesFile();
	     
	        deals_title.sendKeys(title); 
	        deals_amount.sendKeys(amount);
	        //withTimeoutOf(Duration.ofSeconds(10)).find(By.name("amount")).sendKeys(amount);
	        deals_probability.sendKeys(probability);
	        deals_commision.sendKeys(commision);
	        logger.info("Deals values entered");
	        //getDriver().manage().timeouts().implicitlyWait(20, SECONDS);
	        Thread.sleep(500);
	       // new_button.click();
	    }

	
}
