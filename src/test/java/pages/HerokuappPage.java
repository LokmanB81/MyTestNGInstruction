package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities1.Driver;

public class HerokuappPage {
  public   HerokuappPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='onblur']")
    public WebElement onBlurButton;

  @FindBy(xpath = "//*[@id='onclick']")
    public WebElement onClickButton;

  @FindBy(xpath = "//*[@id='oncontextmenu']")
    public WebElement onContextMenuButton;

    @FindBy(xpath = "//*[@id='ondoubleclick']")
    public WebElement onDoubleClickButton;

    @FindBy(xpath = "//*[@id='onfocus']")
    public WebElement onFocusButton;

    @FindBy(xpath = "//*[@id='onkeydown']")
    public WebElement onKeyDownButton;

    @FindBy(xpath = "//*[@id='onkeyup']")
    public WebElement onKeyUpButton;

    @FindBy(xpath = "//*[@id='onkeypress']")
    public WebElement onKeyPressButton;

    @FindBy(xpath = "//*[@id='onmouseover']")
    public WebElement onMouseOverButton;

  @FindBy(xpath = "//*[@id='onmouseleave']")
  public WebElement onMouseLeaveButton;


    @FindBy(xpath = "//*[@id='onmousedown']")
    public WebElement onMouseDownButton;




}
