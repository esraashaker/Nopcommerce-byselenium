package utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class helper {
    public static void screenshoots(WebElement driver , String screenphoto) throws IOException {

        Path destnation= Paths.get("./screenshots",screenphoto+".png");
        Files.createDirectories(destnation.getParent());
        FileOutputStream out=new FileOutputStream(destnation.toString());
        out.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
             out.close();
    }
}
