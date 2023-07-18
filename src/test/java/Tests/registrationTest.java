package Tests;

import Pages.HomePage;
import Pages.RegistrationPage;
import Pages.loginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class registrationTest extends TestBase {

    HomePage homePage;
    RegistrationPage Registration;

    @Test
    public void registrationfullForm() {
        homePage = new HomePage(driver);
        homePage.openRegaitrationPage();
        Registration = new RegistrationPage(driver);
        Registration.registrationForm("Esraa", "shaker", "esraa100a9m20@gmail.com", "itworks", "123456");
        Assert.assertTrue(Registration.registcucessfully.getText().contains("Your registration completed"));
    }

}
