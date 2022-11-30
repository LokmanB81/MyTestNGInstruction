package tests.day21;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities1.Driver;
import utilities1.ReusableMethods;

import java.io.IOException;

public class C01_ScreenShotReusableMethod {
    @Test
    public void test1() throws IOException {
// bestbuy git, ekran goruntusu al...
        Driver.getDriver().get("https://www.bestbuy.com");
        ReusableMethods.getScreenshot("bestbuy");
        Driver.closeDriver();
    }

    @Test
    public void test2() throws IOException {
        Driver.getDriver().get("https://www.amazon.com");
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.searchBox.sendKeys("nutella", Keys.ENTER);
        ReusableMethods.getScreenshotWebElement("amazonSonuc",amazonPage.searchResult);


    }
}