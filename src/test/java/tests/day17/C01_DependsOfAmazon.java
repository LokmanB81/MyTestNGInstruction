package tests.day17;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities1.TestBaseBeforeClassAfterClass;

public class C01_DependsOfAmazon extends TestBaseBeforeClassAfterClass {

    @Test
    public void test1() {
        //https://www.amazon.com/ adresine gidin.
        driver.get("https://amazon.com");
        driver.navigate().refresh();
    }

    @Test(dependsOnMethods = "test1")
    public void homePagetest() {
        //1. Test : Amazon ana sayfaya gittiginizi test edin
        String expectedUrl="https://www.amazon.com/";
        Assert.assertEquals(expectedUrl,driver.getCurrentUrl());
    }

    @Test(dependsOnMethods = "homePagetest")
    public void searcTest() {
       // 2. Test : 1.Test basarili ise search Box’i kullanarak “Nutella” icin
      //  arama yapin ve aramanizin gerceklestigini Test edin
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mouse", Keys.ENTER);
        String actualText=driver.findElement(By.xpath("//*[@class='a-color-state a-text-bold']")).getText();
       // System.out.println(actualText);
        String expectedText="\"Mouse\"";
       Assert.assertEquals(expectedText,actualText);
    }

    @Test(dependsOnMethods = "searcTest")
    public void firstproductTest() {
        //3.Test : “Nutella” icin arama yapildiysa ilk urunu tiklayin ve fiyatinin
        //$5.94 oldugunu test edin
        action.moveToElement(driver.findElement(By.xpath("(//img[@class='s-image'])[1]"))).click().perform();

       String price_1 =driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
       String price_2 =driver.findElement(By.xpath("(//span[@class='a-price-fraction'])[1]")).getText();
        String actualPrice="$"+price_1+"."+price_2;
        System.out.println(actualPrice);

        String expectedPrice="$5.94";
     //  Assert.assertEquals(expectedPrice,actualPrice);
    }
}
