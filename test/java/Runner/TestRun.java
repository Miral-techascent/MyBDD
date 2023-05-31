package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\patel\\IdeaProjects\\MyBDD\\src\\test\\resources\\Login.feature",
        glue = {"StepDefinitions"},
        dryRun = false
)

public class TestRun {
}
