package Tests;

import Pages.SearchPage;
import org.testng.annotations.Test;

public class SearchTest extends TestBase{
    SearchPage searchObject;
    String productname="Apple MacBook Pro 13-inch";
    @Test
    public void searchresulit(){
        searchObject=new SearchPage(driver);
       searchObject.productNametxt();
        searchObject.productsenkeys(productname);
       searchObject.searchsag();
    searchObject.searchbtnClick();
      //searchObject.opendetialsPage();
    }
}
