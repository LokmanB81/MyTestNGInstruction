package tests.Odev;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.HepsiBuradaPage;
import utilities1.Driver;
import utilities1.ReusableMethods;

import java.io.IOException;

public class HepsiBuradaLocateOdev {
    @Test
    public void test1() throws InterruptedException, IOException {

        // //Hepsiburada sayfasına gidiniz
        Driver.getDriver().get("https://www.hepsiburada.com");

        Actions action=new Actions(Driver.getDriver());
        HepsiBuradaPage hepsiBuradaPage=new HepsiBuradaPage();


         //Elektronik altında bilgisayar/tablet altındaki tüm linkleri tıklayalım
        for (int i = 0; i < 66; i++) {
            Thread.sleep(500);
            action.clickAndHold(hepsiBuradaPage.ustMenuler.get(0)).perform(); // Elektronik e tikla
            Thread.sleep(500);
            action.moveToElement(hepsiBuradaPage.bilgisayarMenu).perform(); // Bilgisayar/Tablet uzerine git
            action.click(hepsiBuradaPage.bilgisayarMenuAltLinkler.get(i)).perform(); // butun linklere sirayla tikla

            //Her linkten sonra o sayfaya gittimizi test edelim
            //   ???

            // ve o sayfanın resmini alalım
            ReusableMethods.getScreenshot("hepsiburadaAltSayfa"+i+"_");

            // Ana sayfaya geri donelim.
            Driver.getDriver().navigate().back();
        }

        //Sayfayı kapatalım
           // Driver.closeDriver();
    }
}
