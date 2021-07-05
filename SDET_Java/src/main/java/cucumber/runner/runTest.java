package cucumber.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/cucumber/feature",
        glue= {"cucumber.steps"},
        dryRun = true,
        monochrome = true
)
public class runTest {
}
