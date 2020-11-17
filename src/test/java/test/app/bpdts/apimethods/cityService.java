package test.app.bpdts.apimethods;

import test.app.bpdts.utils.ConfigFactory;

public class cityService extends BaseService {

    ConfigFactory configFactory = new ConfigFactory();

    public void getListOfCityUsers(String cityName) {
        getRequestWithSingleParam(configFactory.getProperty("GET_USERS_IN_CITY"), cityName);
    }
}
