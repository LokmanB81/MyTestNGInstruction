package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities1.Driver;

public class BlueRentalCarPage {

    public BlueRentalCarPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[@role='button'])[1]")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id='formBasicEmail']")
    public WebElement eMailBox;

    @FindBy(xpath = "//*[@id='formBasicPassword']")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement girisLoginButton;

    @FindBy(xpath = "//*[@id='dropdown-basic-button']")
    public WebElement girisKontrol;

}
