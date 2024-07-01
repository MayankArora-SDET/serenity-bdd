package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/"},
glue = {"stepDefination"} , tags = "@API",  plugin = {"pretty", "json:target/cucumber-report/cucumber.json"},
publish = true)
public class Runner{

}
