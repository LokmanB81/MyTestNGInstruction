package tests.day16;

import utilities1.Driver;

public class C06_MethodBodies {

    public static void openPage(){

        Driver.getDriver().get("https://amazon.com");
    }

    public void openBestBuy(){
        Driver.getDriver().get("https://bestbuy.com");
    }
}
