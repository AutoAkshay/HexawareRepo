package runner;

import drivers.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;


public class Hooks{


    @Before
    public void beforeScenario(){
        System.out.println("Browser launched");
        WebDriver driver=DriverFactory.getDriver();
        driver.manage().window().maximize();
    }

    @After
    public void afterScenario(){
        System.out.println("Browser is closed");
        DriverFactory.getDriver().quit();
    }
}
