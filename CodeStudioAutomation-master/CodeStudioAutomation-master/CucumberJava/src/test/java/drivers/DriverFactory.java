package drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    public static WebDriver driver;
    public static String browser="chrome";

    public static WebDriver getDriver(){

        switch (browser){
            case "chrome" :
                if (driver == null) {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                }
                break;

            case "edge" :
                if (driver == null) {
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                }
                break;

            case "firefox" :
                if (driver == null) {
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                }
                break;

            default:
                System.out.println("Invalid browser");
        }

        return driver;
    }

    public static void quitDriver(){
        driver.quit();
        driver.close();
    }
}
