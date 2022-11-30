package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities1.Driver;

public class WebappsecurityPage {
    public WebappsecurityPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy (xpath ="//*[@id='signin_button']")
    public WebElement signInHomePage;

    @FindBy (xpath = "//*[@id='user_login']")
    public WebElement loginBox;

    @FindBy (xpath = "//*[@id='user_password']")
    public WebElement passwordBox;

    @FindBy (xpath = "//*[@type='submit']")
    public WebElement signInEntry;





}
