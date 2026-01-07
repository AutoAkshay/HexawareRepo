package basicJava.collections.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProviderTest {

    @Test(dataProvider = "searchData",dataProviderClass = DataProvider.class)
    public void test1(String state,String building){

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys(state + building);

    }
}
