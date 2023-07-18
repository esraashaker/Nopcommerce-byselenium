package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
    protected  WebDriver driver;
    public JavascriptExecutor Jse;
     public Select selectt;
     public Actions action;
    public PageBase(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
    protected static void clickBtn(WebElement button){
        button.click();
    }
    protected static void sendkyess(WebElement txtbox,String value){
        txtbox.sendKeys(value);
    }
public void ScrollToBottom (){
Jse.executeScript("scrollBy(0,2500)");
}

}



