package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pageObjects.LoginPageObject;

public class LoginSteps extends ScenarioSteps {

    LoginPageObject LoginPageObject;

    @Step
    public void launchTheUrl() throws Exception{

        LoginPageObject.LaunchTheHomeUrl();
    }

/*    @Step
    public void enteringTheCredentials() throws Exception{

        LoginPageObject.enteringCredentials();
    }

	public void webtable(String string, String string2) {
		
		LoginPageObject.logindetail(string,string2);
		
	}*/

  
}
