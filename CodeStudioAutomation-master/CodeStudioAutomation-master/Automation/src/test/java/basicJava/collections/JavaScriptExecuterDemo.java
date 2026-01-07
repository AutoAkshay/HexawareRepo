package basicJava.collections;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecuterDemo {

    @Test
    public void test() throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");
        Thread.sleep(5000);
        JavascriptExecutor executor=(JavascriptExecutor) driver;
        executor.executeScript("document.getElementById('user-name').value='standard_user';");
        executor.executeScript("document.getElementById('password').value='secret_sauce';");
        Thread.sleep(5000);
        WebElement loginButton=driver.findElement(By.id("login-button"));

        WebElement loginBtn=driver.findElement(By.id("login-button"));
        executor.executeScript("arguments[0].click();",loginBtn);

    }
}
