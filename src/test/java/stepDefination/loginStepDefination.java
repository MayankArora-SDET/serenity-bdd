package stepDefination;

import org.openqa.selenium.WebDriver;

import common.commonCode;
import common.launchBrowser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.environment.SystemEnvironmentVariables;
import net.thucydides.core.util.EnvironmentVariables;
import pages.Login;

public class loginStepDefination extends PageObject  {

    @Steps
    launchBrowser launch;
    
    @Managed
    WebDriver driver;

    private static EnvironmentVariables var = SystemEnvironmentVariables.createEnvironmentVariables();

    @Steps
    private Login login;

    private commonCode cc = new commonCode();

    @Given("Navigate to {} Application")
    public void launchApplication(String product) throws InterruptedException {
        String baseURL = EnvironmentSpecificConfiguration.from(var).getProperty(product + ".base.url");
        launch.launchSiteURL(baseURL);
    }

    @When("Enter Creds")
    public void Enter_Creds() {
        login.userName.sendKeys(cc.readFromProperty("credentials.properties", "username"));
    }

    @Then("Verify Dasboard page")
    public void Verify_Dasboard_page() {
        // Add verification code here
    }
}
