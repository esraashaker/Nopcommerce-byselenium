package Tests;

import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class selectfromMenu extends TestBase{
    HomePage homePage;
   @Test
   public void menuselect(){
        homePage=new HomePage(driver);
       homePage.selectmycomputers();
       homePage.selectparmenu();
     Assert.assertTrue(driver.getCurrentUrl().contains("cell-phones"));
    }
}
