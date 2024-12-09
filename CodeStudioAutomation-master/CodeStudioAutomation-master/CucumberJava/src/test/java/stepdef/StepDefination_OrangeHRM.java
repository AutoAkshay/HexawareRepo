package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.cucumber.java.en.*;


public class StepDefination_OrangeHRM {
	WebDriver driver;
	
	
	@Given("User launches the chrome browser")
	public void user_launches_the_chrome_browser() {
		System.setProperty("webdriver.driver.com", "C:\\Software\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Software\\chromedriver-win64\\chrome-win64\\chrome.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
	}

	@Given("User launches Orange URL")
	public void user_launches_url() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@And("User enters Orange credentials")
	public void user_enters_credentials() throws InterruptedException {

		Thread.sleep(3000);

		driver.findElement(By.name("username")).sendKeys("Admin");

		driver.findElement(By.name("password")).sendKeys("admin123");

	}

	@When("User click on Orange login button")
	public void user_click_on_login_button() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

	}

	@Then("User Orange logs out")
	public void user_logs_out() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(text(),'user')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		driver.close();

	}

}
