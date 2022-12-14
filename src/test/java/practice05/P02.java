package practice05;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities1.TestBaseBeforeClassAfterClass;

public class P02 extends TestBaseBeforeClassAfterClass {
    @Test
    public void test1() {
        // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
        driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");

        // 2. JavaScript alertin "CLICK ME!" seçeneğine tıklayın
        driver.findElement(By.xpath("//*[@id='button1']")).click();

    // 3. Açılır metni alın
      String message=driver.switchTo().alert().getText();
// 4. Mesajın "I am an alert box!" olduğunu doğrulayın.
        String expectedMessage="I am an alert box!";
        Assert.assertEquals(expectedMessage,message);
// 5. Açılır pencereyi kabul edin
        driver.switchTo().alert().accept();

    }
}
