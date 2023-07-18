package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utilities.helper;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase {


    public static WebDriver driver;

    @BeforeSuite
    @Parameters("browser")
    public void StartDriver( @Optional ("chrome" ) String browserName ){
        if(browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }
        else if(browserName.equalsIgnoreCase("firefox")){
            driver=new FirefoxDriver();
        }
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(200000, TimeUnit.SECONDS);
            driver.navigate().to("https://demo.nopcommerce.com/");




    }



    @AfterSuite
    public void stopDriver(){
        driver.quit();
    }

@AfterMethod
    public  void screenshotsonlailer(ITestResult result) throws IOException {
        if(result.getStatus()== ITestResult.FAILURE){
            System.out.println("failuer");
            System.out.println("takescreenshot....");
            helper.screenshoots((WebElement) driver,result.getName());
        }

}
}


