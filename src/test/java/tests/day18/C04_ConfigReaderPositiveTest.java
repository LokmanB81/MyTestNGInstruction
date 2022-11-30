package tests.day18;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCamp;
import utilities1.ConfigReader;
import utilities1.Driver;

import java.io.File;
import java.io.IOException;

public class C04_ConfigReaderPositiveTest {

    @Test
    public void test1() throws IOException {
        // https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperties("hotelUrl"));

        // ilk gidilen sayfanın ekran goruntusu

        File ilkGirisSayfa= ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ilkGirisSayfa,new File("target/hotelPageTest/ilkGirisSayfa.jpeg"));



        HotelMyCamp hotelMyCamp=new HotelMyCamp();

        // login butonuna bas
        hotelMyCamp.hotelLoginButton.click();

        // test data username: manager ,  test data password : Manager1!
        hotelMyCamp.hotelUsernameBox.sendKeys(ConfigReader.getProperties("hotelUsername"));
        hotelMyCamp.hotelPasswordBox.sendKeys(ConfigReader.getProperties("hotelpassword"));
        hotelMyCamp.signInButton.click();

        // Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(hotelMyCamp.userText.isDisplayed());

        File hedefSayfaninTamami_1= ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(hedefSayfaninTamami_1,new File("target/hotelPageTest/hedefSayfaninTamami_1.jpeg"));

        File hedefSayfaninTamami= (Driver.getDriver().
                findElement(By.xpath("//html[@lang='en']"))).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(hedefSayfaninTamami,new File("target/hotelPageTest/hedefSayfaninTamami.jpeg"));

       // WebElement userDropFoto=Driver.getDriver().findElement(By.xpath("//*[@class='dropdown dropdown-user']"));
        File girisFoto=hotelMyCamp.userDropFoto.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(girisFoto,new File("target/hotelPageTest/girisKontrol.jpeg"));

        Driver.closeDriver();

    }
}
