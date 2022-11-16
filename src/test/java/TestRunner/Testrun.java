package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/home/thrym2/IdeaProjects/WMS_AUTOMATION/src/main/resources/features/Login.feature",
        glue="Stepdefination",
        dryRun = true,
        monochrome = true,
        plugin ={ "pretty" , "html:Output_report"}

)
public class Testrun {
}
