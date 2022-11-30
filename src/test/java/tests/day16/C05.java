package tests.day16;


import utilities1.Driver;

public class C05  {


    public static void main(String[] args) {

        C06_MethodBodies c06MethodBodies=new C06_MethodBodies();
        C05 c05=new C05();


        C06_MethodBodies.openPage();
        c06MethodBodies.openBestBuy();
        techproPage();
        c05.ebayPage();





    }

    public static void techproPage(){
        Driver.getDriver().get("https://techproeducation.com");
    }

    public  void ebayPage(){
        Driver.getDriver().get("https://ebay.com");
    }




}
