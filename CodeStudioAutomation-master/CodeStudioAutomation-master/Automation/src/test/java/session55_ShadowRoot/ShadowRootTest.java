package session55_ShadowRoot;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Properties;

//Create a function Java + Sel
//It will take data from feature file
//Name of product, qntty of that eg.
//Cucumber 2kgs


import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ShadowRootTest {

    @Test
    public void shadowRoot() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://selectorshub.com/xpath-practice-page/");

        JavascriptExecutor executor = (JavascriptExecutor) driver;

        executor.executeScript("window.scrollBy(0,1500);");

        WebElement shadowHost = driver.findElement(By.cssSelector("#userName"));

        SearchContext shadowRoot = shadowHost.getShadowRoot();

        WebElement input = shadowRoot.findElement(By.cssSelector("#kils"));
        input.sendKeys("Akshay Kalam");

        Thread.sleep(3000);
        driver.quit();
    }

}
