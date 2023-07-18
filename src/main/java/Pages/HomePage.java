package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase{


    public HomePage(WebDriver driver) {

        super(driver);
        Jse = (JavascriptExecutor) driver;
        action=new Actions(driver);

    }
    @FindBy(linkText = "Register")
    WebElement registerLink;
    @FindBy(linkText = "Log in")
    WebElement logintxt;
    public void openRegaitrationPage(){
    clickBtn(registerLink);
    }
    @FindBy(linkText = "Contact us")
    WebElement opencontact;
    @FindBy(id="customerCurrency")
    WebElement changecurrency;
    @FindBy(linkText ="Electronics")
    WebElement selectmenu;
    @FindBy(linkText ="Cell phones")
    WebElement selectphonesfrommenu;
    public void openloginPage(){
        clickBtn(logintxt);
    }

public void opencontacpage(){
        ScrollToBottom();
    clickBtn(opencontact);}

public void choosecurrency(){
selectt =new Select(changecurrency);
selectt.selectByVisibleText("Euro");

}
public void selectmycomputers(){
        action.moveToElement(selectmenu)
                .click()
                .build()
                .perform();
}
public void selectparmenu(){
    action.moveToElement(selectphonesfrommenu)
            .click()
            .build()
            .perform();
    }

}

