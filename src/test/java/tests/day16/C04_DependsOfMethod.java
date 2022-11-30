package tests.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities1.TestBaseBeforeClassAfterClass;

public class C04_DependsOfMethod extends TestBaseBeforeClassAfterClass {
    @Test
    public void test1() {
        driver.get("https://amazon.com");

    }

    @Test(dependsOnMethods = "test1")
    public void test2() {
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']//"))
                .sendKeys("Nutella", Keys.ENTER);

    }

    @Test(dependsOnMethods = "test2")
    public void testName() {
        String expectedWord="Nutella";
      String actualWord=driver.findElement(By.xpath("(//*[@class='sg-col-inner'])[1]")).getText();
        Assert.assertNotEquals(expectedWord,actualWord);

    }
}
