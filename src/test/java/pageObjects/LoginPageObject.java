package pageObjects;

import org.junit.Assert;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
//import org.openqa.selenium.support.FindBy;
import utilities.DefaultPageObject;
import utilities.TestUtil;

public class LoginPageObject extends DefaultPageObject {

   // Properties prop = new Properties();

    TestUtil til = new TestUtil();

 /*   @FindBy(xpath = "//input[@name='email']")
    private WebElementFacade txtUsername;

    @FindBy(xpath = "//*[@name='password']")
    private WebElementFacade txtPassword;

    @FindBy(xpath = "//*[@id='ui']/div/div/form/div/div[3]")
    private WebElementFacade btnLogin;

    @FindBy(xpath = "/html/head/title")
    private WebElementFacade TitleName;*/
    
  

    public void LaunchTheHomeUrl() throws Exception{

    	logger.info("Enters the method-open URL");
      // prop=loadThePropertiesFile();
        Thread.sleep(4000);
        getDriver().get(prop.getProperty("baseURL"));
        logger.info("URL opened");
        //getDriver().manage().timeouts().implicitlyWait(20, SECONDS);
        getDriver().manage().window().maximize();
        Thread.sleep(500);
    }

/*    public void enteringCredentials() {

       // withTimeoutOf(30, SECONDS).waitFor(txtUsername);
        
       System.out.println("implicit timeout is"+getImplicitWaitTimeout());
       System.out.println("explicit timeout is"+getWaitForTimeout());
    	
        txtUsername.sendKeys("kannan21109444@gmail.com");
       // txtPassword.sendKeys("Aswath555.");
        btnLogin.waitUntilVisible();
        btnLogin.click();

    }

    public void validateLoginPageTitle() {

        String title=TitleName.getText().trim();
        Assert.assertEquals("Cogmento CRM", title);
        logger.info("Title verified");
    }

	public void logindetail(String string, String string2) {
		
		txtUsername.sendKeys(string);
        txtPassword.sendKeys(string2);
       
		
	}
*/


}

	

