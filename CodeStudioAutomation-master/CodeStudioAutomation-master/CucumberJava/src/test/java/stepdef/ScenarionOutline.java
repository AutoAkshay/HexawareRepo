package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.*;

public class ScenarionOutline {
	WebDriver driver;
	@Given("User launching the URL")
	public void user_launching_the_url() {
		System.setProperty("webdriver.driver.com", "C:\\Software\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Software\\chromedriver-win64\\chrome-win64\\chrome.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@When("^User enters (.*) and (.*)$")
	public void user_enters_admin_and_admin123(String username,String password ) throws InterruptedException {
		
		Thread.sleep(3000);

		driver.findElement(By.name("username")).sendKeys(username);

		driver.findElement(By.name("password")).sendKeys(password);
	    
	}
	@Then("User clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	    
	}




}
