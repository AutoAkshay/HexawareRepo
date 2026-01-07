package stepdef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Map;

public class SauLabStepDef {
    WebDriver driver;
    @Given("User launches the url")
    public void user_launches_the_url() {
        driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @When("User gives {string} and {string}")
    public void user_gives_and(String string, String string2) {

        driver.findElement(By.id("user-name")).sendKeys(string);
        driver.findElement(By.id("password")).sendKeys(string2);
    }

    @When("User clicks on login button")
    public void user_lands_on_home_page() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("User closed the browser")
    public void user_closed_the_browser() {
        driver.quit();
    }


    @When("User gives username and password")
    public void userGivesUsernameAndPassword(DataTable table) {
       List<Map<String,String>> ls=table.asMaps(String.class,String.class);
        driver.findElement(By.id("user-name")).sendKeys(ls.get(0).get("username"));
        driver.findElement(By.id("password")).sendKeys(ls.get(0).get("password"));
    }
}
