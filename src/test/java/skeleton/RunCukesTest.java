package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(@cucumberoptions(features = "src/test/resources/feature", plugin = { "json:target/cucumber.json", "html:target/site/cucumber-pretty" })
public class RunCukesTest {
}
