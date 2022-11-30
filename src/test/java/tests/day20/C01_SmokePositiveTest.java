package tests.day20;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCamp;
import utilities1.ConfigReader;
import utilities1.Driver;

public class C01_SmokePositiveTest {
    // 3) Bir test method olustur positiveLoginTest()
    @Test
    public void positiveLoginTest() {

        // https://www.hotelmycamp.com adresine git
        Driver.getDriver().get(ConfigReader.getProperties("hotelUrl"));

        // login butonuna bas
        HotelMyCamp hotelMyCamp=new HotelMyCamp();
        hotelMyCamp.hotelLoginButton.click();

        // test data username: manager ,
        hotelMyCamp.hotelUsernameBox.sendKeys(ConfigReader.getProperties("hotelUsername"));

        // test data password : Manager1!
        hotelMyCamp.hotelPasswordBox.sendKeys(ConfigReader.getProperties("hotelpassword"));

        // Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        hotelMyCamp.signInButton.click();

        Assert.assertTrue(hotelMyCamp.userText.isDisplayed());


    }
}
