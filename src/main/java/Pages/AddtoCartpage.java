package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddtoCartpage extends PageBase{
    public AddtoCartpage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="small-searchterms")
    WebElement searchbox;
    @FindBy(id="ui-id-1")
    WebElement productName;
    @FindBy(xpath="/html/body/div[6]/div[1]/div[2]/div[2]/form/button")
    WebElement searchBtn;

    @FindBy(id="add-to-cart-button-4")
    WebElement addtocartBtn;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[1]/a/img")
    WebElement detialsproduct;
    @FindBy(linkText = "shopping cart")
    WebElement shoppongcart;
    @FindBy(id="termsofservice")
    WebElement agreetrems;
    @FindBy(id="checkout")
    WebElement checkoutbtn;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]")
    WebElement checkoutbygeust;
    public void chckoutbygeust(){
        clickBtn(checkoutbygeust);
    }
    public void usercancheckout(){
        clickBtn(agreetrems);
        clickBtn(checkoutbtn);
    }
    public void shoppingcartpage(){
        clickBtn(shoppongcart);
    }
    public void opendetialsPage(){
        clickBtn(detialsproduct);
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
    public void searchsag(){
        clickBtn(productName);
    }

    public void addtocartbutton() {
      clickBtn(addtocartBtn);    }
}


