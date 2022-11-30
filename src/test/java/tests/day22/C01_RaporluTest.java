package tests.day22;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BlueRentalCarPage;
import utilities1.ConfigReader;
import utilities1.Driver;
import utilities1.TestBaseRapor;

public class C01_RaporluTest extends TestBaseRapor {

    BlueRentalCarPage blueRentalCarPage;
    @Test
    public void test1() {
        extentTest=extentReports.createTest("Pozitif Test", "Gecerli kullanici adi ve password ile giris testi");
       // -https://www.bluerentalcars.com/ adresine git

        Driver.getDriver().get(ConfigReader.getProperties("blueRentalUrl"));
        extentTest.info("BlueRentACar sitesine gidildi");

        blueRentalCarPage=new BlueRentalCarPage();
        // -login butonuna bas
        blueRentalCarPage.loginButton.click();
        extentTest.info("Login butonuna tiklandi");
        // -test data user email: customer@bluerentalcars.com
        blueRentalCarPage.eMailBox.sendKeys(ConfigReader.getProperties("blueUserEmail"));

        // -test data password : 12345 dataları girip login e basın
        blueRentalCarPage.passwordBox.sendKeys(ConfigReader.getProperties("blueUserPaswoord"));
        extentTest.info("Dogru kullanici email ve password girildi");
        // -login butonuna tiklayin
        blueRentalCarPage.girisLoginButton.click();
        extentTest.info("Giris icin logine tiklandi");
        // -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(blueRentalCarPage.girisKontrol.isDisplayed());
        extentTest.pass("Test basarili sekilde tamamlandi");

    }

}
