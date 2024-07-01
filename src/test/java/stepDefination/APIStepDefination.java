package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.ApiSteps;

public class APIStepDefination {

    @Steps
    ApiSteps apiSteps;

    @Given("I set the endpoint to {string}")
    public void iSetTheEndpointTo(String endpoint) {
        apiSteps.setEndpoint(endpoint);
    }

    @When("I send a GET request")
    public void iSendAGETRequest() {
        apiSteps.sendGetRequest();
    }

    @Then("the response status code should be {int}")
    public void theResponseStatusCodeShouldBe(int statusCode) {
        apiSteps.verifyStatusCode(statusCode);
    }

    @Then("the response should contain {string}")
    public void theResponseShouldContain(String expectedValue) {
        apiSteps.verifyResponseContains(expectedValue);
    }
}
