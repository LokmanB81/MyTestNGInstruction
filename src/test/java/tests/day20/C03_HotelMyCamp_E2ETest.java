package tests.day20;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCamp;
import utilities1.ConfigReader;
import utilities1.Driver;

public class C03_HotelMyCamp_E2ETest {
    @Test
    public void E2E_Test() throws InterruptedException {
        // https://www.hotelmycamp.com adresine git
        Driver.getDriver().get(ConfigReader.getProperties("hotelUrl"));
        //4. Username textbox ve password metin kutularını locate edin ve asagidaki verileri
        //a. Username : manager
        //b. Password : Manager1!
        HotelMyCamp hotelMyCamp=new HotelMyCamp();
        hotelMyCamp.hotelLoginButton.click();
        hotelMyCamp.hotelUsernameBox.sendKeys(ConfigReader.getProperties("hotelUsername"));
        hotelMyCamp.hotelPasswordBox.sendKeys(ConfigReader.getProperties("hotelpassword"));
        //5. Login butonuna tıklayın.
        hotelMyCamp.signInButton.click();
       // Hotel Management/Room reservation menusunden ADD ROOM RESERVATION butonuna tiklayin
        hotelMyCamp.hotelMangementMenu.click();
        hotelMyCamp.roomReservation.click();
        hotelMyCamp.addRoomReservationButton.click();

        // Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        Select slc=new Select(hotelMyCamp.idUserBox);
        slc.selectByVisibleText(ConfigReader.getProperties("hotelUsername"));
         hotelMyCamp.hotelRoomNumber.sendKeys(ConfigReader.getProperties("newRoomNumber"));
         hotelMyCamp.hotelPrice.sendKeys(ConfigReader.getProperties("price"));
         hotelMyCamp.dateStart.sendKeys(ConfigReader.getProperties("hotelDateStart"));
         hotelMyCamp.dateEnd.sendKeys(ConfigReader.getProperties("hotelDateEnd"));
         hotelMyCamp.adultAmount.sendKeys("2");
         hotelMyCamp.childAmount.sendKeys("2");
         hotelMyCamp.contactNameSurname.sendKeys(ConfigReader.getProperties("contactNameSurname"));
         hotelMyCamp.phoneNumber.sendKeys("5556664444");
         hotelMyCamp.eMail.sendKeys(ConfigReader.getProperties("eMail"));
         hotelMyCamp.noteBox.sendKeys("fdkjgfdjkgdfjk");
         Driver.getDriver().findElement(By.xpath("//input[@id='Approved']")).click();
        // Thread.sleep(300);
         hotelMyCamp.submitButton.click();
        Thread.sleep(1000);
        Assert.assertTrue(hotelMyCamp.basariliSonuc.isDisplayed());

        hotelMyCamp.okButton.click();
        Driver.closeDriver();

    }
}
