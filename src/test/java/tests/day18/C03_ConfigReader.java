package tests.day18;

import org.testng.annotations.Test;
import utilities1.Driver;


public class C03_ConfigReader {

    @Test(groups = "gp1")
    public void test1(){
        // amazon ve facebook a gidelim
       // Driver.getDriver().get(ConfigReader.getProperties("amazonUrl"));
       /// Driver.getDriver().get(ConfigReader.getProperties("faceUrl"));
      //  String urlAmzn=ConfigReader.getProperties("amazonUrl");
       // Driver.getDriver().get(urlAmzn);
        Driver.getDriver().get("https://amazon.com");
        Driver.closeDriver();


    }
}
