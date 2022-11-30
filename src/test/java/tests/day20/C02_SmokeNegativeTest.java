package tests.day20;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCamp;
import utilities1.ConfigReader;
import utilities1.Driver;

public class C02_SmokeNegativeTest { // invalidUserName , validPassword
    // 3) Bir test method olustur negtiveLoginTest()
    @Test
    public void invalidUsername() {

        // https://www.hotelmycamp.com adresine git
        Driver.getDriver().get(ConfigReader.getProperties("hotelUrl"));
        // login butonuna bas
        HotelMyCamp hotelMyCamp = new HotelMyCamp();
        hotelMyCamp.hotelLoginButton.click();
        // test data username: manager ,
         hotelMyCamp.hotelUsernameBox.sendKeys(ConfigReader.getProperties("hotelInvalidUserName"));
         // test data password : Manager1!
        //hotelMyCamp.hotelPasswordBox.sendKeys(ConfigReader.getProperties("hotelInvalidPassword"));
        hotelMyCamp.hotelPasswordBox.sendKeys(ConfigReader.getProperties("hotelpassword"));
        // Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        hotelMyCamp.signInButton.click();
        Assert.assertTrue(hotelMyCamp.girilemedi.isDisplayed());
        Driver.closeDriver();

    }

    @Test
    public void invalidPassword() { // validUserNmae , invalidPassword

        // https://www.hotelmycamp.com adresine git
        Driver.getDriver().get(ConfigReader.getProperties("hotelUrl"));
        // login butonuna bas
        HotelMyCamp hotelMyCamp = new HotelMyCamp();
        hotelMyCamp.hotelLoginButton.click();
        // test data username: manager ,
        hotelMyCamp.hotelUsernameBox.sendKeys(ConfigReader.getProperties("hotelInvalidUserName"));
        // test data password : manager1
        hotelMyCamp.hotelPasswordBox.sendKeys(ConfigReader.getProperties("hotelInvalidPassword"));
        // Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        hotelMyCamp.signInButton.click();
        Assert.assertTrue(hotelMyCamp.girilemedi.isDisplayed());
        Driver.closeDriver();

    }

    @Test
    public void invalidUserName_AndPassword() { // invalidUserName , invalidPassword

        // https://www.hotelmycamp.com adresine git
        Driver.getDriver().get(ConfigReader.getProperties("hotelUrl"));
        // login butonuna bas
        HotelMyCamp hotelMyCamp = new HotelMyCamp();
        hotelMyCamp.hotelLoginButton.click();
        // test data username: manager ,
        hotelMyCamp.hotelUsernameBox.sendKeys(ConfigReader.getProperties("hotelUsername"));
        // test data password : manager1
        hotelMyCamp.hotelPasswordBox.sendKeys(ConfigReader.getProperties("hotelInvalidPassword"));
        // Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        hotelMyCamp.signInButton.click();
        Assert.assertTrue(hotelMyCamp.girilemedi.isDisplayed());
        Driver.closeDriver();

    }
}
