package test.app.bpdts.apimethods;

import test.app.bpdts.utils.ConfigFactory;

public class userService extends BaseService {

    ConfigFactory configFactory = new ConfigFactory();

    public void getInstructions() {
        getRequest(configFactory.getProperty("GET_INSTRCTIONS"));
    }

    public void getUserById(String id) {
        getRequestWithSingleParam(configFactory.getProperty("GET_USER"), id);
    }

    public void usersList() {
        getRequest(configFactory.getProperty("GET_ALL_USERS"));
    }
}
