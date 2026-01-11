package session_Exceptionals;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SortedListAssertionsTest {


    WebDriver driver;
    public static boolean sortedAscList(List<String> actual) {
        List<String> expected= new ArrayList<>(actual);
        Collections.sort(expected);
        for (String str:expected){
            System.out.println("Expected list::"+str);
        }
        System.out.println();
        for (String str:actual){
            System.out.println("Actual list::"+str);
        }
        return expected.equals(actual);
    }

    public static boolean sortedDecList(List<String> actual) {
        List<String> expected= new ArrayList<>(actual);

        Collections.sort(expected,Collections.reverseOrder());

        for (String str:expected){
            System.out.println("Expected list::"+str);
        }
        System.out.println();
        for (String str:actual){
            System.out.println("Actual list::"+str);
        }

        return expected.equals(actual);
    }

    @Test
    public void test() throws InterruptedException {

        driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Thread.sleep(5000);

        driver.findElement(By.cssSelector("select#dropdown-class-example")).click();

        List<WebElement> options=driver.findElements(By.xpath("//select[@id='dropdown-class-example']//option"));
        List<String> ls=new ArrayList<>();
        for (WebElement option:options){
           ls.add(option.getText());
        }

        boolean b=SortedListAssertionsTest.sortedDecList(ls);

        Assert.assertTrue(b,"not matching");
        driver.quit();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

