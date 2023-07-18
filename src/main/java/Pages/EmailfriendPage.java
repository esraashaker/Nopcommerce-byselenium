package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailfriendPage extends PageBase{
    public EmailfriendPage(WebDriver driver) {
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
    @FindBy(id="small-searchterms")
    WebElement searchbox;
    @FindBy(id="ui-id-1")
    WebElement productName;
    @FindBy(xpath="/html/body/div[6]/div[1]/div[2]/div[2]/form/button")
    WebElement searchBtn;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[1]/a/img")
    WebElement detialsproduct;
@FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[9]/div[3]/button")
WebElement emailToFriend;
@FindBy(id="FriendEmail")
WebElement friendemail;
@FindBy(id="YourEmailAddress")
WebElement yourEmail;
@FindBy(id="PersonalMessage")
WebElement pmessage;
@FindBy(css="button.button-1:nth-child(1)")
WebElement sendbtn;
    public void fullregistrationForm(String fName ,String lName ,String email,String company, String password){
        clickBtn(genderName);
        sendkyess(fNametxtbox,fName);
        sendkyess(lNametxtBox,lName);
        sendkyess(EmailBox,email);
        sendkyess(companyBox,company);
        sendkyess(PasswordTxtBox,password);
        sendkyess(cPasswordTxtBox,password);
        clickBtn(registerBtn);
    }
    public void productNametxt() {
        clickBtn(searchbox);
    }
    public void productsenkeys(String productname){
        sendkyess(searchbox,productname);

    }
    public void searchbtnClick(){
        clickBtn(searchBtn);
    }
    public void opendetialsPage(){
        clickBtn(detialsproduct);
    }
    public void searchsag(){
        clickBtn(productName);
    }
    public void emailtofriendbtn(){
        clickBtn(emailToFriend);
    }
    public void fullformtosendmessage(String emailfriend, String myemail , String message){
        sendkyess(friendemail,emailfriend);
        sendkyess(yourEmail,myemail);

        sendkyess(pmessage,message);
        clickBtn(sendbtn);

    }
}
