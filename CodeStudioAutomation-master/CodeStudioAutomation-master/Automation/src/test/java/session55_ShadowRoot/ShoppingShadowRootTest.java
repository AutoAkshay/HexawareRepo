package session55_ShadowRoot;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShoppingShadowRootTest {

    @Test
    public void shopShadow() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://shop.polymer-project.org/");

        Thread.sleep(5000);

        WebElement shopApp=driver.findElement(By.cssSelector("shop-app[page=home]"));
        SearchContext shopAppShadow=shopApp.getShadowRoot();

        WebElement shopHome=shopAppShadow.findElement(By.cssSelector("shop-home[name=home]"));
        SearchContext shopHomeShadow=shopHome.getShadowRoot();

        WebElement shopNow = shopHomeShadow.findElement(By.cssSelector("a[aria-label='Men\\'s Outerwear Shop Now']"));

        shopNow.click();

    }
}
