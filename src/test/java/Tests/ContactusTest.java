package Tests;

import Pages.ContactusPage;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactusTest extends TestBase{
    String fullname="esraa shaker";
    String Emaill="esraas44alkkkllll@gmail.com";
    String message="hello";
    HomePage homeobject;
    ContactusPage contactobject;
   @Test
    public void opencontactuspage(){
        homeobject=new HomePage(driver);
        homeobject.opencontacpage();
        contactobject=new ContactusPage(driver);
        contactobject.fullform(fullname,Emaill,message);
        contactobject.submitBTN();
    }

}
