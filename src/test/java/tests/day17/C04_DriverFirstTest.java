package tests.day17;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
import utilities1.Driver;

public class C04_DriverFirstTest {
    @Test
    public void test1() {
        Driver.getDriver().get("https://amazon.com");
        Driver.getDriver().switchTo().newWindow(WindowType.WINDOW).get("https://bestbuy.com");
        Driver.getDriver().get("https://ebay.com");
        Driver.getDriver().switchTo().newWindow(WindowType.TAB).get("https://youtube.com");


        Driver.closeDriver();

        Driver.getDriver().get("https://amazon.com");

        Driver.closeDriver();
    }
}
