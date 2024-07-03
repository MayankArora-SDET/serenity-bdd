package runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.cucumber.suiteslicing.SerenityTags;
import net.thucydides.core.environment.SystemEnvironmentVariables;
import net.thucydides.core.util.EnvironmentVariables;

public class TestBase extends PageObject {

	static EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();

	@BeforeClass
	public static void setUp() {

	}

	@Before
	public void before() throws FileNotFoundException {
		SerenityTags.create().tagScenarioWithBatchingInfo();
	}

	@After
	public void afterScenario() throws IOException {
		getDriver().manage().deleteAllCookies();
		getDriver().close();
		getDriver().quit();
	}

	@AfterClass
	public static void tearDown() {
		
	}



	public static void main(String[] args) throws Throwable {

	}
}