package Tests;

import Pages.EmailfriendPage;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmailfriendTest extends  TestBase{

    String email="sraadqeasaslkllll20@gmail.com";

    HomePage homeobject;
    EmailfriendPage friendobject;
    String productname="Apple MacBook Pro 13-inch";

    @Test(priority = 1)
    public void regastrationform(){
        homeobject =new HomePage(driver);
        homeobject.openRegaitrationPage();
        friendobject = new EmailfriendPage(driver);
        friendobject.fullregistrationForm("Esraa", "shaker", email, "itworks", "123456");
    }
    @Test(priority = 2)
    public void searchforProduct(){
        friendobject=new EmailfriendPage(driver);
        friendobject.productNametxt();
        friendobject.productsenkeys(productname);
        friendobject.searchbtnClick();
       friendobject.opendetialsPage();
    }
    @Test(priority = 3,dependsOnMethods = {"searchforProduct"})
    public void sendmessagetofriend(){
        friendobject.emailtofriendbtn();

        friendobject =new EmailfriendPage(driver);
        friendobject.fullformtosendmessage("karim@gmail.com",email,"hello friend");
    }
}
