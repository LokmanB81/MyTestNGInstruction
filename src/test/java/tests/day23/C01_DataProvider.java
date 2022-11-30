package tests.day23;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities1.ConfigReader;
import utilities1.Driver;

public class C01_DataProvider {
    @DataProvider
    public static Object[][] aranacakKelimeler() {
        return new Object[][]{{"java"},{"selenium"},{"samsung"},{"iphone"}};
    }

    @Test(dataProvider = "aranacakKelimeler")
    public void test02(String kelimeler) {
        AmazonPage amazonPage=new AmazonPage();
        //amazona gidelim
        Driver.getDriver().get(ConfigReader.getProperties("amazonUrl"));
        System.out.println("yeniden calisti");

        //java, selenium, samsung ve iphone icin arama yapalim
    amazonPage.searchBox.sendKeys(kelimeler, Keys.ENTER);
    //sonuclarin aradigimiz kelime icerdigini test edelim
    String actualKelime = amazonPage.searchResult.getText();
    Assert.assertTrue(actualKelime.contains(kelimeler));

        //sayfayi kapatalim
       // Driver.closeDriver();
    }

    @Test(dependsOnMethods = "test02")
    public void  test03(){
        Driver.closeDriver();
    }
}
