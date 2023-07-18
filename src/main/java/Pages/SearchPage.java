package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase {

    public SearchPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="small-searchterms")
    WebElement searchbox;
    @FindBy(id="ui-id-1")
    WebElement productName;
    @FindBy(xpath="/html/body/div[6]/div[1]/div[2]/div[2]/form/button")
    WebElement searchBtn;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[1]/a/img")
   WebElement detialsproduct;
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
}
