package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactusPage extends PageBase {

    public ContactusPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "FullName")
    WebElement fullname;
    @FindBy(id = "Email")
    WebElement Email;
    @FindBy(id = "Enquiry")
    WebElement Enquiry;
    @FindBy(name = "send-email")
    WebElement submitBtn;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]")
    public WebElement secuessesubmit;

    public void fullform(String name, String email, String enqiry) {
        sendkyess(fullname, name);
        sendkyess(Email, email);
        sendkyess(Enquiry, enqiry);
    }

    public void submitBTN() {
        clickBtn(submitBtn);

    }

}