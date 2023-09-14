package api.exlab.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json"
        },
        features = "src/test/resources/features",
        glue = "api/exlab/stepDefs",
        dryRun = false,
        tags = "@apiuı"

)

public class CukesRunner {

}
