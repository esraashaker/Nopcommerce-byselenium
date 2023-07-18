package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends PageBase{

    public RegistrationPage(WebDriver driver) {
        super(driver);

    }
    @FindBy(id="gender-male")
    WebElement genderName;
    @FindBy(id="FirstName")
    WebElement fNametxtbox;
    @FindBy(id="LastName")
    WebElement lNametxtBox;
    @FindBy(id="Email")
    WebElement EmailBox;
    @FindBy(id="Company")
    WebElement companyBox;
    @FindBy(id="Password")
    WebElement PasswordTxtBox;
    @FindBy(id="ConfirmPassword")
    WebElement cPasswordTxtBox;
    @FindBy(id="register-button")
    WebElement registerBtn;
    @FindBy(className="result")
    public  WebElement registcucessfully;


    @FindBy(linkText = "Log in")
    WebElement logintxt;
    public void registrationForm(String fName ,String lName ,String email,String company, String password){
        clickBtn(genderName);
sendkyess(fNametxtbox,fName);
sendkyess(lNametxtBox,lName);
sendkyess(EmailBox,email);
sendkyess(companyBox,company);
sendkyess(PasswordTxtBox,password);
sendkyess(cPasswordTxtBox,password);
clickBtn(registerBtn);
    }
    public void openloginPage(){
        clickBtn(logintxt);
    }


}