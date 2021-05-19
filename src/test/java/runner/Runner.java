package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		 dryRun = true//,
		//plugin = {"html:target/cucmber-html-report"},
		
       // features = "src/test/java/cucumber/features"
       
        //glue = "src/test/java/stepDefinitions",
        //plugin = {"pretty","html:target/cucumber",}
    

        )
public class Runner {

}
