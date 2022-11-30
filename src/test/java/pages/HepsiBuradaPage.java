package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities1.Driver;

import java.util.List;

public class HepsiBuradaPage {
    public HepsiBuradaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='sf-MenuItems-UHHCg2qrE5_YBqDV_7AC']")
    public List<WebElement> ustMenuler;

    @FindBy (xpath = "(//li/a[@href='https://www.hepsiburada.com/bilgisayarlar-c-2147483646'])[1]")
    public WebElement bilgisayarMenu;

   // @FindBy (xpath = "//ul/li/a/span")
    @FindBy (xpath = "//ul/li/a")
    public List<WebElement> bilgisayarMenuAltLinkler;

}
