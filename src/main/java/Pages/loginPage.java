package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends PageBase{
    public loginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name="Email")
    WebElement emailtxt;
    @FindBy(id="Password")
    WebElement passwordtxt;
    @FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")
    WebElement btnloginxt;
    @FindBy(linkText = "My account")
    WebElement myAccounttxt;

public void loginForm(String email,String password){
sendkyess(emailtxt,email);
sendkyess(passwordtxt,password);
clickBtn(btnloginxt);

}
    public void myaccountpa(){
        clickBtn(myAccounttxt);
    }

}
