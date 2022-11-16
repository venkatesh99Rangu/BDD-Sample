package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".//features/Login.feature",
        glue="Stepdefination",
        dryRun = false,



        monochrome = true,
        plugin ={ "pretty" , "html:Output_report"}

)
public class Testrun {
}
