package session1_9;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.Color;

public class Session2_Color {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.com", "C:\\Software\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Software\\chromedriver-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		WebElement signInButtonColor=driver.findElement(By.xpath("//*[@aria-label='Sign in']"));
		
		String background=signInButtonColor.getCssValue("background");
		
		Color color= Color.fromString(background);
		
		String asHex=color.asHex();
		
		System.out.println("color::"+asHex);
		
	}
}
