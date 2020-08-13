package runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin= {"pretty","html:target","junit:junit_xml/cucumber.xml"},
	    		  features = ".\\src\\test\\resources\\features\\Background.feature",
	    		  glue= {"stepDefinitions"},
	    		  dryRun=false,
		          monochrome=true)
		          //tags= {"~@smokeTest","~@sanityTest"}
public class TestRunner {
		
	}




