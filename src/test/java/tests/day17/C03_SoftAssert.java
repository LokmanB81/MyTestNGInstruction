package tests.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities1.Driver;
import utilities1.TestBaseBeforeClassAfterClass;

public class C03_SoftAssert extends TestBaseBeforeClassAfterClass {
    SoftAssert softAssert=new SoftAssert();
    @Test
    public void test1() {



        //1-amazon anasayfaya gidin
        driver.get("https://amazon.com");
        //2-title in Amazon içerdigini test edin
        softAssert.assertTrue(driver.getTitle().contains("Amazon"),"girdiginiz kelime yok");
        //3-arama kutusnun erişilebilir oldugunu tets edin
        softAssert.assertTrue(driver.findElement(By.id("twotabsearchtextbox")).isEnabled(),"Web elementi erisilemez");
        //4-arama kutusuna Nuella yazıp aratın
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella", Keys.ENTER);
        //5-arama yapıldıgını test edin
        WebElement sonuc=driver.findElement(By.xpath("//*[@class='a-color-state a-text-bold']"));
        softAssert.assertTrue(sonuc.isDisplayed(),"sonuc goruntulenmedi");

        //6-arama sonucunun Nutella içerdigini test edin
        softAssert.assertTrue(sonuc.getText().contains("Nutella"),"sonuc nutella icermiyor");
       softAssert.assertAll();
       Driver.quitDriver();


    }

    @Test
    public void test2() {
        driver.get("https://bestbuy.com");
        softAssert.assertFalse(Driver.getDriver().getTitle().contains("bestbuy"),"bestbuy icermiyor");
        softAssert.assertAll();

        Driver.quitDriver();
    }
}
