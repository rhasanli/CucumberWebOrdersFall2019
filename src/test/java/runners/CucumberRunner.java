package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/vytrack/step_definitions",
        features = "src/test/resources/features",
        // dryRun = true -> checking if every test has code implementation, otherwise cucumber wil create it
        dryRun = false, // execute test
        //dryRun = true,
        //strict = true,
        strict = false,
        tags = "  @create_car_ddt",
        plugin = {
                "html:target/cucumber-html-report",
                "json:target/cucumber.json"
        }
)
public class CucumberRunner {
}
