package test.app.bpdts.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import test.app.bpdts.apimethods.userService;

public class instructionStepDefs extends userService {

    Response response;

    @Given("user makes GET request to retrieve instructions")
    public void request_for_instructions() {
        setBaseURI();
        getInstructions();
    }

    @Then("^the status code for instructions returned should be \"([^\"]*)\"$")
    public void statusCode(String expectedStatusCode) {
       verifyStatusCode(expectedStatusCode);
    }
}
