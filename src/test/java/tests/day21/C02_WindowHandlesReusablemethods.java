package tests.day21;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities1.Driver;
import utilities1.ReusableMethods;

import java.util.ArrayList;

public class C02_WindowHandlesReusablemethods {

    @Test
    public void test1() {
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");

        Driver.getDriver().findElement(By.xpath("//*[text()='Click Here']")).click();
        ArrayList<String> pencereler=new ArrayList<>(Driver.getDriver().getWindowHandles());

        Driver.getDriver().switchTo().window(pencereler.get(1));

        Assert.assertTrue(Driver.getDriver().getTitle().equals("New Window"));

        Driver.quitDriver();

        //● https://the-internet.herokuapp.com/windows adresine gidin.
        //● Click Here butonuna basın.
        // acilan yeni tab'in title'inin "New Window" oldugunu test edin
    }

    @Test
    public void test2() {
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");

        Driver.getDriver().findElement(By.xpath("//*[text()='Click Here']")).click();
        ReusableMethods.switchToWindow("New Window");

        Assert.assertTrue(Driver.getDriver().getTitle().equals("New Window"));

        Driver.quitDriver();

    }
}
