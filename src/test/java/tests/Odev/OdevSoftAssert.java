package tests.Odev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.WebappsecurityPage;
import utilities1.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OdevSoftAssert {
    WebappsecurityPage webappsecurityPage=new WebappsecurityPage();
    @Test
    public void test1() throws InterruptedException {
        // 1. “http://zero.webappsecurity.com/” Adresine gidin
        Driver.getDriver().get("http://zero.webappsecurity.com/");
       // 2. Sign in butonuna basin
    webappsecurityPage.signInHomePage.click();
    //3. Login kutusuna “username” yazin
        webappsecurityPage.loginBox.sendKeys("username");
    // 4. Password kutusuna “password” yazin
        webappsecurityPage.passwordBox.sendKeys("password");
        //5. Sign in tusuna basin
        webappsecurityPage.signInEntry.click();
        Driver.getDriver().navigate().back();
        //6. Online banking menusu icinde Pay Bills sayfasina gidin
        Driver.getDriver().findElement(By.xpath("//*[@id='onlineBankingMenu']")).click();
        Driver.getDriver().findElement(By.xpath("//*[@id='pay_bills_link']")).click();
        // 7. “Purchase Foreign Currency” tusuna basin
        Driver.getDriver().findElement(By.xpath("//*[text()='Purchase Foreign Currency']")).click();
        // 8. “Currency” drop down menusunden Eurozone’u secin
        Select slc=new Select(Driver.getDriver().findElement(By.xpath("//*[@id='pc_currency']")));
        slc.selectByVisibleText("Eurozone (euro)");
        // 9. soft assert kullanarak "Eurozone (Euro)" secildigini test edin
        Thread.sleep(250);
        String dropText=Driver.getDriver().findElement(By.xpath("(//p[@class='help-block'])[2]")).getText();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(dropText.contains("1 euro (EUR)"),"Eurozone secilmedi");



        // 10.soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin
        List<WebElement> dropSecenekleri=Driver.getDriver().findElements(By.xpath("//select[@id='pc_currency']/option"));
        List<String> expectedSecenekler=new ArrayList<>(Arrays.asList("Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)",
                "China (yuan)","Denmark (krone)","Eurozone (euro)","Great Britain (pound)","Hong Kong (dollar)","Japan (yen)",
                "Mexico (peso)","Norway (krone)","New Zealand (dollar)","Sweden (krona)","Singapore (dollar)","Thailand (baht)"));

        for (int i = 0; i < expectedSecenekler.size(); i++) {
            softAssert.assertEquals(expectedSecenekler.get(i),dropSecenekleri.get(i).getText());

        }
        softAssert.assertAll();


    }

/*

"Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)","China
(yuan)","Denmark (krone)","Eurozone (euro)","Great Britain (pound)","Hong Kong
(dollar)","Japan (yen)","Mexico (peso)","Norway (krone)","New Zealand
(dollar)","Sweden (krona)","Singapore (dollar)","Thailand (baht)"

     */
}
