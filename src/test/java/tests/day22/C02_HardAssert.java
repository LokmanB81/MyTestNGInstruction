package tests.day22;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities1.TestBaseCross;

public class C02_HardAssert extends TestBaseCross{

    @Test
    public void test1() {

        //1-amazon anasayfaya gidin
        driver.get("https://amazon.com");
       // AmazonPage amazonPage=new AmazonPage();
        driver.navigate().refresh();
        //2-title in Amazon içerdigini test edin
        Assert.assertTrue(driver.getTitle().contains("Amazon"));
        //3-arama kutusnun erişilebilir oldugunu tets edin
        Assert.assertTrue(driver.findElement(By.id("twotabsearchtextbox")).isEnabled());

        //4-arama kutusuna Nuella yazıp aratın
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella",Keys.ENTER);
        //5-arama yapıldıgını test edin
        WebElement sonuc=driver.findElement(By.xpath("//*[@class='a-color-state a-text-bold']"));
        Assert.assertTrue(sonuc.isDisplayed());

        //6-arama sonucunun Nutella içerdigini test edin
        Assert.assertTrue(sonuc.getText().contains("Nutella"));

    }
}
