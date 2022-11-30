package tests.Odev;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities1.TestBaseBeforeClassAfterClass;

public class Priority_Odev extends TestBaseBeforeClassAfterClass {
    @Test(priority = 1)
    public void test1() {
        //2) https://www.youtube.com adresine gidin
        driver.get("https://youtube.com");
    }

    @Test(priority = 2)
    public void titleTest() {

        //titleTest => Sayfa başlığının “YouTube” oldugunu test edin
        String expectedTitle="YouTube";
        String actualUrl= driver.getTitle();
        Assert.assertEquals(expectedTitle,actualUrl);
    }

    @Test(priority = 4)
    public void imageTest() {
        // imageTest => YouTube resminin görüntülendiğini (isDisplayed()) test edin
        Assert.assertTrue(driver.findElement(By.xpath("(//*[@id='logo-icon'])[1]")).isDisplayed());
    }

    @Test(priority = 5)
    public void testName() {
        //Search Box 'in erisilebilir oldugunu test edin (isEnabled())
        Assert.assertTrue(driver.findElement(By.xpath("(//*[@id='search'])[3]")).isEnabled());
    }

    @Test(priority = 3)
    public void wrongTitleTest() {
//wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
        String expectedTitle="youtube";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertNotEquals(expectedTitle,actualUrl);

    }


}
