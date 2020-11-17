package test.app.bpdts.apimethods;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import test.app.bpdts.utils.ConfigFactory;

public class BaseService {

    RequestSpecification request;
    Response response;
    ConfigFactory configFactory = new ConfigFactory();

    public void setBaseURI() {
        RestAssured.baseURI = configFactory.getProperty("BASE_URL");
        request = RestAssured.given().header("Content-Type", "application/json");
    }

    public void getRequest(String uri) {
        response = request.when().get(uri);
    }

    public void getRequestWithSingleParam(String uri, String paramValue) {
        response = request.when().get(uri, paramValue);
    }

    public void verifyStatusCode(String expectedStatusCode) {
        System.out.println("Status code is: " + response.getStatusCode());
        Assert.assertEquals(Integer.parseInt(expectedStatusCode), response.getStatusCode());
    }

    public void verifyResponseBody(String hasUsers) {
        ResponseBody responseMessage = response.getBody();
        System.out.println("Response Body is: " + responseMessage.asString());
    }
}
