package Com.Package.Buggy.StepDefintions;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:cucmber-html-reports"},
        tags = "@TestCase1",
        features = {"src/test/resources"})
public class Runner
{
}
