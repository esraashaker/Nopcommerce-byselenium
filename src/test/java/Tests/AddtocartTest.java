package Tests;

import Pages.AddtoCartpage;
import Pages.EmailfriendPage;
import Pages.HomePage;
import org.testng.annotations.Test;


public class AddtocartTest extends TestBase{
    HomePage homeobject;
    AddtoCartpage addtocart;
    String productname="Apple MacBook Pro 13-inch";
    @Test(priority = 2)
    public void searchforProduct(){
        homeobject=new HomePage(driver);
        addtocart=new AddtoCartpage(driver);
        addtocart.productNametxt();
        addtocart.productsenkeys(productname);
        addtocart.searchbtnClick();
       addtocart.opendetialsPage();
    }
    @Test(priority = 3,dependsOnMethods = {"searchforProduct"})
    public void sendmessagetofriend(){
        addtocart.addtocartbutton();
        addtocart.shoppingcartpage();
        addtocart.usercancheckout();
        addtocart.chckoutbygeust();

    }


}
