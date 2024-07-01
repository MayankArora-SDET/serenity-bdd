package pages;

import static net.serenitybdd.rest.SerenityRest.when;
import static org.hamcrest.Matchers.containsString;

import io.restassured.response.Response;
import net.thucydides.core.annotations.Step;

public class ApiSteps {

    private String endpoint;
    private Response response;

    @Step("Set the endpoint to {0}")
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    @Step("Send a GET request")
    public void sendGetRequest() {
        response = when().get(endpoint);
    }

    @Step("The response status code should be {0}")
    public void verifyStatusCode(int statusCode) {
        response.then().statusCode(statusCode);
    }

    @Step("The response should contain {0}")
    public void verifyResponseContains(String expectedValue) {
        response.then().body(containsString(expectedValue));
    }
}
