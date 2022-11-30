package tests.day17;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities1.Driver;

public class C05_PagesClass {

    @Test
    public void test1() {
        Driver.getDriver().get("https://amazon.com");
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.searchBox.sendKeys("Nutella", Keys.ENTER);
        Driver.closeDriver();
    }
}
