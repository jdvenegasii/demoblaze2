package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {".//features/"},
        glue = "steps",
        plugin = {"pretty", "html:Report1"},
        dryRun = false,
        strict = true,
        monochrome = true
        ,tags = {"@DB-54 or @DB-53 or @DB-55"}
        //,name = {"Logo"}
)
public class TestRunner {
}

