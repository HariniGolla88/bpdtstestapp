package test.app.bpdts.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import test.app.bpdts.apimethods.userService;

public class userStepDefs extends userService {

    @Given("^user makes GET request to retrieve user details with \"([^\"]*)\"$")
    public void given_existed_user_id(String id) {
        setBaseURI();
        getUserById(id);
    }

    @Then("^the status code returned for the user id should be \"([^\"]*)\"$")
    public void status_code_for_user_id(String expectedStatusCode) {
        verifyStatusCode( expectedStatusCode);
    }

    @And("^the response should contain the user details \"([^\"]*)\"$")
    public void response_body_with_user_details(String userDetails) {
        verifyResponseBody(userDetails);
    }

    @When("a GET request is made to retrieve the list of all users")
    public void request_for_all_the_users() {
        setBaseURI();
        usersList();
    }

    @Then("^the status code returned for all users should be \"([^\"]*)\"$")
    public void status_code_of_all_users(String expectedStatusCode) {
        verifyStatusCode(expectedStatusCode);
    }

    @And("^the response should be populated \"([^\"]*)\"$")
    public void response_body_with_all_the_user_details(String usersList) {
        verifyResponseBody(usersList);
    }
}
