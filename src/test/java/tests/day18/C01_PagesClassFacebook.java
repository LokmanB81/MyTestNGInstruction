package tests.day18;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookLogin;
import utilities1.Driver;

public class C01_PagesClassFacebook {

    @Test
    public void test1() throws InterruptedException {

        // 1 - https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com/");

       // 2 POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
       // 3 Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
        Faker fake=new Faker();
        FacebookLogin facebookLogin=new FacebookLogin();

        facebookLogin.emailBox.sendKeys(fake.internet().emailAddress());
        facebookLogin.passwordBox.sendKeys(fake.internet().password());
        facebookLogin.loginButton.click();

        // 4 Basarili giris yapilamadigini test edin
        Assert.assertTrue(facebookLogin.noLogin.isDisplayed());
       // Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[@class='_9ay7']")).isDisplayed());
    }
}
