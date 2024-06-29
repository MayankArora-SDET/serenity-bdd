package stepDefination;

import common.commonCode;
import common.launchBrowser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import pages.login;

public class loginStepDefination extends launchBrowser{
	
	@Steps
	launchBrowser launch;
	@Steps
	static EnvironmentVariables var = SystemEnvironmentVariables.createEnvironmentVariables();
	
	login login = new login();
	commonCode cc = new commonCode();
	
	@Given("Navigate to {} Application")
	public void launchApplication(String product) throws InterruptedException {
		
		String baseURL = EnvironmentSpecificConfiguration.from(var).getProperty(product+".base.url");
		launch.launchSiteURL(baseURL);
	}
	@When("Enter Creds")
	public void Enter_Creds() {
		login.userName.sendKeys(cc.readFromProperty("credentials.properties", "username"));
	}
	@Then("Verify Dasboard page")
	public void Verify_Dasboard_page() {
		
	}

}
