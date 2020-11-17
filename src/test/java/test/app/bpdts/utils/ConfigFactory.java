package test.app.bpdts.utils;

import com.typesafe.config.Config;

public class ConfigFactory {
    Config config = com.typesafe.config.ConfigFactory.parseResources("api.properties");
    public String getProperty(String propName) {
        return config.getString(propName);
    }
}
