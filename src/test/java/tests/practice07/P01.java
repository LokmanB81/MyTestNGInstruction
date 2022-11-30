package tests.practice07;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WebdriveruniversityPage;
import utilities1.Driver;

import java.util.Arrays;
import java.util.List;

public class P01 {
    @Test
    public void testName() {
        // http://webdriveruniversity.com/To-Do-List/index.html
        Driver.getDriver().get("http://webdriveruniversity.com/To-Do-List/index.html");

        // // Todos ekle: (Kahvaltıyı hazırla, Bulaşıkları yıka, Bebekle ilgilen,
        // Çocuğunun ödevine yardım et, Selenyum çalış, Uyu)
        WebdriveruniversityPage webdriveruniversity=new WebdriveruniversityPage();

        List<String> isListesi= Arrays.asList("Kahvaltiyi hazirla","Kahvaltiyi hazirla","Bulasiklari yika","Bebekle ilgilen",
                "Cocugun odevine yardim et","Selenium calis","uyu");

        for (String each:isListesi
             ) {
            webdriveruniversity.addNewTodoBox.sendKeys(each,Keys.ENTER);

        }

        // //Tüm yapılacakların üzerini çiz.

        for (WebElement each:webdriveruniversity.todoList
             ) {
            each.click();
        }


        //Tüm yapılacakları sil.

        webdriveruniversity.todoListDelete.forEach(t-> t.click());



        //Tüm yapılacakların silindiğini doğrulayın.
      //Assert.assertTrue(webdriveruniversity.sontodoList.size()!=0);
      Assert.assertTrue(webdriveruniversity.todoList.size()!=0);
    }

}
