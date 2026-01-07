package session55_ShadowRoot;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NestedShadowTest {

    @Test
    public void shadowFrame() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://selectorshub.com/xpath-practice-page/");

        JavascriptExecutor executor = (JavascriptExecutor) driver;

        executor.executeScript("window.scrollBy(0,1800);");
        Thread.sleep(3000);

        WebElement shadowWindow=driver.findElement(By.cssSelector("div#userName"));
        SearchContext context=shadowWindow.getShadowRoot();
        context.findElement(By.cssSelector("input#kils")).sendKeys("Akshay");


        SearchContext context2=context.findElement(By.cssSelector("div#app2")).getShadowRoot();
        context2.findElement(By.cssSelector("input")).sendKeys("pass@123");

    }
}
