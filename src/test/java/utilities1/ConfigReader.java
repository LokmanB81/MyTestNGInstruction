package utilities1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties properties;



    static {
        String path="configuration.properties";

        try {
            FileInputStream fis=new FileInputStream(path);
            properties=new Properties();
            properties.load(fis);
        }
                catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public static String getProperties(String key){
        return properties.getProperty(key);
    }


}
