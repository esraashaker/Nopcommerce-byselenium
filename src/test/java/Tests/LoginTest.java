package Tests;

import Pages.HomePage;
import Pages.loginPage;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{


        HomePage homePage;
        loginPage loginobject;


        @Test
        public void usercanLogin(){
           homePage = new HomePage(driver);
            homePage.openloginPage();
            loginobject=new loginPage(driver);
            loginobject.loginForm("esraa1m0@gmail.com","123456");
        }
    }


