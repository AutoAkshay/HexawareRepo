package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.*;

public class StepDefination_SauceLogin {
	WebDriver driver;

	@Given("User launches URL")
	public void user_launches_url() {

		System.setProperty("webdriver.driver.com", "C:\\Software\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Software\\chromedriver-win64\\chrome-win64\\chrome.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");

	}

	@And("User enters credentials")
	public void user_enters_credentials() {

		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");

		driver.findElement(By.cssSelector("input[id=password]")).sendKeys("secret_sauce");

	}

	@When("User click on login button")
	public void user_click_on_login_button() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input.submit-button")).click();
	}

	@And("User completes the purchase")
	public void user_makes_the_payment() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("div.inventory_item_name[data-test=inventory-item-name]")).click();
	}

	@Then("User logs out")
	public void user_logs_out() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
		System.out.println("Test case is passed");

	}

}
