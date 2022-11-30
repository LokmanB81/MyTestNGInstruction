package practice05;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities1.TestBaseBeforeClassAfterClass;

public class P01 extends TestBaseBeforeClassAfterClass {
    @Test
    public void test1() throws InterruptedException {
        // go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        //fill the firstname
        driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Lokman");
        //fill the lastname
        driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("bbbb");
        //check the gender
        driver.findElement(By.xpath("//*[@id='sex-0']")).click();
        //check the experience
        driver.findElement(By.xpath("//*[@id='exp-3']")).click();
        //fill the date
        driver.findElement(By.xpath("//*[@id='datepicker']")).sendKeys("01/01/2000");
        //choose your profession -> Automation Tester
        Thread.sleep(100);
        driver.findElement(By.xpath("//*[@id='profession-1']")).click();
        //choose your tool -> Selenium Webdriver
        Thread.sleep(100);
        driver.findElement(By.xpath("//*[@id='tool-2']")).click();
        //choose your continent -> Antartica
        Thread.sleep(100);
        WebElement dropMenu= driver.findElement(By.xpath("//*[@id='continents']"));
        Select slc=new Select(dropMenu);
        slc.selectByVisibleText("Antartica");
        //choose your command  -> Browser Commands
        Thread.sleep(100);
        driver.findElement(By.xpath("//*[text()='Browser Commands']")).click();
        //click submit button
        Thread.sleep(100);
        driver.findElement(By.xpath("//*[@id='submit']")).click();



    }













}
