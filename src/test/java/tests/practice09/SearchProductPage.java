package tests.practice09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExercisePage;
import utilities1.ConfigReader;
import utilities1.Driver;

public class SearchProductPage  {
    @Test
    public void test1() {
        // // 2. 'http://automationexercise.com' url'sine gidin
        Driver.getDriver().get(ConfigReader.getProperties("autoExerUrl"));

        // / 3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
        Assert.assertEquals(ConfigReader.getProperties("autoExerUrl"),Driver.getDriver().getCurrentUrl());

        // 4. 'Ürünler' butonuna tıklayın
        Actions action=new Actions(Driver.getDriver());
        AutomationExercisePage exercisePage=new AutomationExercisePage();

        action.click(exercisePage.productsMenu).perform();

        // 5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın
        Assert.assertEquals(ConfigReader.getProperties("autoExerPruductUrl"),Driver.getDriver().getCurrentUrl());

        // 6. Arama girişine ürün adını girin ve ara düğmesine tıklayın
        exercisePage.searchProductBox.sendKeys(ConfigReader.getProperties("autoSearchProduct"));
        exercisePage.submitSearchButton.click();

        // 7. 'ARARAN ÜRÜNLER'in görünür olduğunu doğrulayın
        for (WebElement each:exercisePage.serchedProductsList
             ) {
            Assert.assertTrue(each.isDisplayed());

        }
//    Assert.assertTrue(exercisePage.serchedProductsList.size()!=0);

        // 8. Aramayla ilgili ürünün ("blue top") görünür olduğunu doğrulayın
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[@src='/get_product_picture/1']")).isDisplayed());

    }
}
