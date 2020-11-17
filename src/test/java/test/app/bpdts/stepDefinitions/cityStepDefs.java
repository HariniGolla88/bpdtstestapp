package test.app.bpdts.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import test.app.bpdts.apimethods.cityService;

public class cityStepDefs extends cityService {

    @Given("^user makes GET request to retrieve all users in \"([^\"]*)\"$")
    public void retrieve_all_users_in_city(String cityName) {
        setBaseURI();
        getListOfCityUsers(cityName);
    }

    @Then("^the status code returned should be \"([^\"]*)\"$")
    public void status_code_of_list_of_users_in_the_city(String expectedStatusCode) {
        verifyStatusCode(expectedStatusCode);
    }

    @And("^the response should contain users \"([^\"]*)\"$")
    public void response_should_contain_users(String hasUsers) {
        verifyResponseBody(hasUsers);
    }
}

