package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities1.Driver;

public class SaudecoHomePage {

    public SaudecoHomePage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@id='user-name']")
    public WebElement userName;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement passWord;

    @FindBy(xpath = "//*[@id='login-button']")
    public WebElement loginButton;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    public WebElement siralamaKriteri;

    @FindBy(xpath = "//option[@value='lohi']")
    public WebElement secilenKriter;




}
