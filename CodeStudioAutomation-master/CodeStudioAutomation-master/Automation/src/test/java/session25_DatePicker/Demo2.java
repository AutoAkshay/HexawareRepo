package session25_DatePicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo2 {

	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.driver.com", "C:\\Software\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Software\\chromedriver-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.navigate().to(("https://www.goibibo.com/"));
		Thread.sleep(5000);
		driver.navigate().refresh();

		driver.findElement(By.xpath("//*[normalize-space()='Departure']")).click();
		Thread.sleep(5000);

		String expectedMMYY = "January 2025";
		String date = "5";
		
		while (true) {
			String caption = driver.findElement(By.className("DayPicker-Caption")).getText();
			if (expectedMMYY.equals(caption)) 
			{
				List<WebElement> dayPicker = driver.findElements(By.className("fsw__date"));

				for (WebElement e : dayPicker) {
					String dates = e.getText();
					if (date.equals(dates)) {
						e.click();
						break;
					}

				}
				
				break;
			}

			else {
				driver.findElement(By.xpath("//*[@aria-label='Next Month']")).click();
			}

		}
	}
}
