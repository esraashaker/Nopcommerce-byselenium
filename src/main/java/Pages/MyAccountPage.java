package Pages;

import Pages.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class MyAccountPage extends RegistrationPage{
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Change password")
    WebElement changePassword;

    @FindBy(id = "OldPassword")
    WebElement oldPassword;
    @FindBy(id = "NewPassword")
    WebElement newPassword;
    @FindBy(id = "ConfirmNewPassword")
    WebElement confirmPassword;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/form/div[2]/button")
    WebElement changpasswordbtn;
    @FindBy(xpath = "/html/body/div[5]/div/p")
    public WebElement successfullchangpassword;
    @FindBy(xpath = "//*[@id=\"bar-notification\"]/div/span")
    WebElement closemeesseg;
    @FindBy(linkText = "My account")
    WebElement myaccountlink;
    @FindBy(linkText = "Log out")
    WebElement logouttxt;
       public void openchangepasswordPage(){
    clickBtn(changePassword);
}
    public void changpasswordForm(String Opassword, String Npassword) {

       sendkyess(oldPassword,Opassword);
       sendkyess(newPassword,Npassword);
        sendkyess(confirmPassword,Npassword);
     clickBtn(changpasswordbtn);
clickBtn(closemeesseg);
       }
    public void logoutPag(){
           clickBtn(logouttxt);
    }
public void accounttxt(){
           clickBtn(myaccountlink);
}
}
