package tests.practice08;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HerokuappPage;
import utilities1.Driver;

import java.util.List;

public class P01 {

    HerokuappPage herokuappPage;
    Actions action;
    @Test
    public void test1() {
        //Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
        Driver.getDriver().get("https://testpages.herokuapp.com/styled/events/javascript-events.html");
//Click all the buttons
       herokuappPage =new HerokuappPage();
       action=new Actions(Driver.getDriver());

       herokuappPage.onBlurButton.click();
       herokuappPage.onClickButton.click();
       herokuappPage.onClickButton.click();
       action.contextClick(herokuappPage.onContextMenuButton)
                    .doubleClick(herokuappPage.onDoubleClickButton)
               .click(herokuappPage.onFocusButton)
               .click(herokuappPage.onKeyDownButton).sendKeys(Keys.ENTER)
               .click(herokuappPage.onKeyUpButton).sendKeys(Keys.ENTER)
               .click(herokuappPage.onKeyPressButton).sendKeys(Keys.ENTER)
               .moveToElement(herokuappPage.onMouseOverButton)
               .moveToElement(herokuappPage.onMouseLeaveButton)
               .moveToElement(herokuappPage.onMouseOverButton)
               .click(herokuappPage.onMouseDownButton).perform();
    }

    //and verify they are all clicked
    @Test(dependsOnMethods = "test1")
    public void test2(){
        List<WebElement> eventTriggered = Driver.getDriver().findElements(By.xpath("//*[text()='Event Triggered']"));
        Assert.assertEquals(11, eventTriggered.size());
    }
}
