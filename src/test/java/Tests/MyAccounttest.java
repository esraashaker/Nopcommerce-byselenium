package Tests;

import Pages.HomePage;
import Pages.MyAccountPage;
import Pages.RegistrationPage;
import Pages.loginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccounttest extends TestBase{
    HomePage homePage;
    RegistrationPage Registration;
    loginPage loginobject;
    MyAccountPage Myaccount;
    String email="esraall1ll12asdasadasdf0@gmail.com";
    String password="123456";
    String changPassword="12345678";
    @Test(priority = 1 ,alwaysRun = true)
    public void registrationfullFormm() {
        homePage = new HomePage(driver);
        homePage.openRegaitrationPage();
        Registration = new RegistrationPage(driver);
        Registration.registrationForm("Esraa", "shaker", email, "itworks", password);
        Assert.assertTrue(Registration.registcucessfully.getText().contains("Your registration completed"));
    }
    @Test(dependsOnMethods = {"registrationfullFormm"})
    public void usercanbelogin(){
        Registration.openloginPage();
        loginobject=new loginPage(driver);
        loginobject.loginForm(email,password);

    }
    @Test(dependsOnMethods = {"usercanbelogin"})
    public void usercanloginmyaccountpage(){
        loginobject.myaccountpa();
    }
       @Test(dependsOnMethods = {"usercanloginmyaccountpage"})

       public void usercanloginchangpasswordpage(){
          Myaccount=new MyAccountPage(driver);
          Myaccount.openchangepasswordPage();
      }

     @Test(dependsOnMethods = {"usercanloginchangpasswordpage"})
      public void usercanChangepassword(){
      Myaccount=new MyAccountPage(driver);
  Myaccount.changpasswordForm(password,changPassword);
  Assert.assertTrue(Myaccount.successfullchangpassword.getText().contains("Password was changed"));

     }


    @Test(dependsOnMethods = {"usercanChangepassword"})
    public void userlogin() {
        Myaccount.accounttxt();
        loginobject = new loginPage(driver);
        loginobject.loginForm(email, changPassword);
    }

   @Test(dependsOnMethods = "userlogin" )
    public void usercanbelogout(){

        Myaccount.logoutPag();
   }






}
