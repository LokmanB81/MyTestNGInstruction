package tests.day16;

import org.testng.annotations.Test;
import utilities1.TestBaseBeforeMethodAfterMethod;

public class C03_Priority extends TestBaseBeforeMethodAfterMethod {

    /*
    /*Testlerimizi çalıştırırken istediğimiz sıraya göre çalışmasını istersek
    priority methodunu kullanırız
     Priority kullanmazsak default olarak 0 dır
     */
    @Test(priority = 0)
    public void youtubeTest() {
        driver.get("https://youtube.com");

    }

    @Test
    public void bestBuyTest() {
        driver.get("https://bestbuy.com");

    }

    @Test(priority = 3,groups = "gp1")
    public void amazonTest() {
        driver.get("https://amazon.com");

    }
}
