package config;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static org.junit.Assert.assertNotNull;


/**
 * Created by shafiq on 28/01/16.
 */
public class ConfigTest {
    private static Config config = new Config();

    @Ignore
    public void getAPIKey(){
        // get the property value and test it existence
        String api = Config.getAPIKey();
        assertNotNull(api);
    }
}
