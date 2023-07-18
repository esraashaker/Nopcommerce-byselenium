package Tests;

import Pages.HomePage;
import org.testng.annotations.Test;

public class changecurrencyTest extends TestBase{
    HomePage homeobject;
    @Test
    public void currencychange(){
        homeobject=new HomePage(driver);
        homeobject.choosecurrency();
    }
}
