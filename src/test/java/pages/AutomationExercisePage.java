package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities1.Driver;

import java.util.List;

public class AutomationExercisePage {

    public  AutomationExercisePage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy (xpath = "//*[text()=' Products']")
    public WebElement productsMenu;

@FindBy(xpath = "//*[@id='search_product']")
    public WebElement searchProductBox;

    @FindBy(xpath = "//*[@id='submit_search']")
    public WebElement submitSearchButton;

    @FindBy(xpath = "//*[@class='title text-center']")
    public WebElement searchedProductsTitle;

    @FindBy(xpath = "//*[@class='single-products']")
    public List<WebElement> serchedProductsList;


}
