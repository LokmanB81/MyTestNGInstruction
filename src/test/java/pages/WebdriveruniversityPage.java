package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities1.Driver;

import java.util.List;

public class WebdriveruniversityPage {
    public WebdriveruniversityPage()
    {PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//input[@type='text']")
    public WebElement addNewTodoBox;

    @FindBy(xpath = "//ul/li")
    public List<WebElement> todoList;

    @FindBy(xpath = "//span/i[@class='fa fa-trash']")
    public List<WebElement> todoListDelete;

    @FindBy(xpath = "//ul/li")
    public List<WebElement> sontodoList;



}
