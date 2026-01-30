package session20_26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Session20_MultiFramesWithoutTags {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Frames.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();

// outer iframes
        List<WebElement> outerFrames = driver.findElements(By.tagName("iframe"));

        for (WebElement outer : outerFrames) {

            driver.switchTo().frame(outer);

            // inner iframes
            List<WebElement> innerFrames = driver.findElements(By.tagName("iframe"));

            for (WebElement inner : innerFrames) {
                driver.switchTo().frame(inner);
                List<WebElement> inputs = driver.findElements(By.xpath("//input[@type='text']"));
                if(!inputs.isEmpty()){
                    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("WelCome");
                }


                driver.switchTo().parentFrame();
            }
            driver.switchTo().defaultContent();
        }

        driver.quit();
    }
}
