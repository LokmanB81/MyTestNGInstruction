package tests.day16;

import org.testng.annotations.Test;
import utilities1.TestBaseBeforeClassAfterClass;

public class C02_BeforeClassAfterClass extends TestBaseBeforeClassAfterClass {
    /*
    // @BeforeClass ve @AfterClass notasyonlarını TestNG de kullanırken
    JUnit'teki gibi static yapmaya gerek yoktur
     */
    @Test
    public void testAmazon() {
        driver.get("https:/amazon.com");
    }

    @Test
    public void testBestBuy() {
        driver.get("https://bestbuy.com");
    }

    @Test
    public void testTechProEd() {
        driver.get("https://techproeducation.com");
    }

}
