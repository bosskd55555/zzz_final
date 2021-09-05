package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.LoginSteps;

public class LoginPageBDD {

    @Steps
    LoginSteps LoginSteps;

    
    
    @Given("^As a user should be able to launch the application$")
    public void user_opens_the_URL() throws Exception {

        LoginSteps.launchTheUrl();

    }

  /* // @Title("user name and p.w")
    @When("user entering the username and password")
    public void user_enters_username_and_password() throws Exception {

        LoginSteps.enteringTheCredentials();
    }

    @When("user entering the {string} and {string}")
    public void user_entering_the_and(String string, String string2) {
        
    	LoginSteps.webtable(string,string2);
    }
*/
}
