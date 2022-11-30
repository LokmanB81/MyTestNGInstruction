package tests.day23;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BlueRentalCarPage;
import utilities1.ConfigReader;
import utilities1.Driver;

public class C02_DataProvider {

    @DataProvider
    public static Object[][] userData() {
        return new Object[][]{{"lll@gmail.com","11122"},{"kkk@gmail.com","33221"},{"vvv@gmail.com","2020"}};
    }

    @Test(dataProvider = "userData")
    public void test01(String userEmail,String pasword) {

        // -https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperties("blueRentalUrl"));
        BlueRentalCarPage blueRentalCarPage=new BlueRentalCarPage();

        // -login butonuna bas
        blueRentalCarPage.loginButton.click();

        //Data provider ile 3 farklı userEmail ve 3 farklı password girelim
        blueRentalCarPage.eMailBox.sendKeys(userEmail);
        blueRentalCarPage.passwordBox.sendKeys(pasword);

        // -login butonuna tiklayin
        blueRentalCarPage.girisLoginButton.click();

        //Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et
        Assert.assertTrue(blueRentalCarPage.girisLoginButton.isDisplayed());

    }

    @Test(dependsOnMethods = "test01")
    public void test02() {
        Driver.closeDriver();
    }
}
