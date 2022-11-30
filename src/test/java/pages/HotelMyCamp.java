package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities1.Driver;

public class HotelMyCamp {
    public HotelMyCamp (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[text()='Log in']")
    public WebElement hotelLoginButton;

    @FindBy(xpath = "//*[@id='UserName']")
    public WebElement hotelUsernameBox;

    @FindBy(xpath = "//*[@id='Password']")
    public WebElement hotelPasswordBox;

    @FindBy(xpath = "//*[@id='btnSubmit']")
    public WebElement signInButton;

    @FindBy(xpath = "//*[@class='username username-hide-on-mobile']")
    public WebElement userText;

    @FindBy(xpath = "//div[@id='divMessageResult']")
    public WebElement girilemedi;

    @FindBy(xpath = "//*[@class='dropdown dropdown-user']")
    public WebElement userDropFoto;

    @FindBy (xpath = "//span[text()='Hotel Management']")
    public WebElement hotelMangementMenu;

    @FindBy (xpath = "//a[@href='/admin/RoomReservationAdmin']")
    public WebElement roomReservation;

    @FindBy (xpath = "//a[@href='/admin/RoomReservationAdmin/Create']")
    public WebElement addRoomReservationButton;

    @FindBy (xpath = "//select[@id='IDUser']")
    public WebElement idUserBox;

    @FindBy (xpath = "//select[@id='IDHotelRoom']")
    public WebElement hotelRoomNumber;

    @FindBy (xpath = "//input[@id='Price']")
    public WebElement hotelPrice;

    @FindBy (xpath = "//input[@id='AdultAmount']")
    public WebElement adultAmount;

    @FindBy (xpath = "//input[@id='ChildrenAmount']")
    public WebElement childAmount;

    @FindBy (xpath = "//input[@id='ContactNameSurname']")
    public WebElement contactNameSurname;

    @FindBy (xpath = "//input[@id='DateStart']")
    public WebElement dateStart;

    @FindBy (xpath = "//input[@id='DateEnd']")
    public WebElement dateEnd;

    @FindBy (xpath = "//input[@id='ContactPhone']")
    public WebElement phoneNumber;

    @FindBy (xpath = "//input[@id='ContactEmail']")
    public WebElement eMail;

    @FindBy (xpath = "//button[@id='btnSubmit']")
    public WebElement submitButton;

    @FindBy (xpath = "//input[@id='Notes']")
    public WebElement noteBox;

    @FindBy (xpath = "//div[@class='bootbox-body']")
    public WebElement basariliSonuc;

    @FindBy (xpath = "(//button[@type='button'])[8]")
    public WebElement okButton;



}



