package RestAssuredTask.TestRunner;

import RestAssuredTask.Pages.AutomateContactUsPage;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

@CucumberOptions(features = "src/main/java/RestAssuredTask/Features", glue = "RestAssuredTask/StepDefinitions",
        plugin = "pretty"
//        monochrome = true,
//        dryRun = false
//        tags = "@AutomateContactUs"
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
