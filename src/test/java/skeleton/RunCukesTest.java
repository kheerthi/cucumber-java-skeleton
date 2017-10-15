package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature", format = { "json:target/output/cucumber.json", "html:target/output/cucumber-pretty" })
public class RunCukesTest {
}
