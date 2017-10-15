package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "json:target/ouput/cucumber.json", "html:target/output/cucumber-pretty" })
public class RunCukesTest {
}
