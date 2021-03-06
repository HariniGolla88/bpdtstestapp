package test.app.bpdts.runner_class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:features"},
                 plugin = {"pretty", "json:Reports/JSON/cucumber.json", "html:Reports/Cucumber_Reports"},
                 glue = {"test.app.bpdts.stepDefinitions"},
                 strict = true
                )

public class CucumberRunner {
}
