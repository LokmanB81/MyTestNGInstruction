package tests.Odev;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SaudecoHomePage;
import utilities1.ConfigReader;
import utilities1.Driver;

import java.io.File;
import java.io.IOException;

public class OdevPractice_Saudeco  {
    @Test
    public void test1() throws IOException {

        SaudecoHomePage saudecoHomePage=new SaudecoHomePage();


        //     * Navigate to  https://www.saucedemo.com/
        Driver.getDriver().get(ConfigReader.getProperties("saudecoUrl"));

        //     * Enter the username  as standard_user
        saudecoHomePage.userName.sendKeys(ConfigReader.getProperties("saudecoUserName"));

        //     * Enter the password as   secret_sauce
        saudecoHomePage.passWord.sendKeys(ConfigReader.getProperties("saudecoPassword"));

        //     * Click on login button
        saudecoHomePage.loginButton.click();

        //     * Choose price low to high
        Select slc=new Select(saudecoHomePage.siralamaKriteri);
        slc.selectByVisibleText(ConfigReader.getProperties("saudecoSiralamaKriteri"));

        // Take screenshot of dropmenu
        File siralamaKutusu=saudecoHomePage.siralamaKriteri.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(siralamaKutusu,new File("target/saudeco/siralamaKriteri.jpeg"));

        // and verify that PRICE (LOW TO HIGH) is visible
        String expectedText=ConfigReader.getProperties("saudecoSiralamaKriteri");
        Assert.assertEquals(saudecoHomePage.secilenKriter.getText(),expectedText);

        Driver.closeDriver();

    }

}
