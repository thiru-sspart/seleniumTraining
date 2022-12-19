package runners;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = "src/test/resources/features/",
        plugin = {
                "pretty",
                "html:results/cucumber-reports.html",
                "json:results/cucumber.json",
                "junit:results/cucumber.xml",
                "timeline:results/timeline"
        },tags = "@Test",
        glue = "stepDefinitions")
public class TestRunner extends AbstractTestNGCucumberTests {

}
