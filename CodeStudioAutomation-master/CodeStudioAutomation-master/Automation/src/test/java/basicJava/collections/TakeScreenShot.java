package basicJava.collections;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class TakeScreenShot {

    @Test
    public void screenShot(OutputType<File> file) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.deadlinkcity.com/");

        List<WebElement> we=driver.findElements(By.tagName("a"));
        int statusCode=0;
        int count=0;
        for (WebElement urlWE:we){
            String attribute=urlWE.getAttribute("href");

            URL url=new URL(attribute);
            try {
                HttpURLConnection connection=(HttpURLConnection) url.openConnection();
                connection.setRequestMethod("HEAD");
                connection.connect();
                statusCode=connection.getResponseCode();

                if(statusCode>=400){
                    System.out.println(url + " Broken link");
                    count++;
                }
            }

            catch (Exception e){

            }


        }

        System.out.println("Total broken link::"+count);
    }
}
