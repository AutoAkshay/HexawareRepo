package session25_DatePicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {

	public void datePicker(String expectedDate, String expectedMonth, String expectedYear) throws InterruptedException {

//		System.setProperty("webdriver.driver.com", "C:\\Software\\chromedriver-win64\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.setBinary("C:\\Software\\chromedriver-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to(("https://www.dummyticket.com/dummy-ticket-for-visa-application/"));
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='dob']")).click();

		Select month_drp = new Select(driver.findElement(By.xpath("//select[@aria-label='Select month']")));
		month_drp.selectByVisibleText(expectedMonth);

		Select year_drp = new Select(driver.findElement(By.xpath("//select[@aria-label='Select year']")));

		year_drp.selectByVisibleText(expectedYear);

		List<WebElement> dateNumber = driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr/td"));

		for (WebElement d : dateNumber) {

			String date = d.getText();

			if (date.equalsIgnoreCase(expectedDate)) {
				d.click();
				break;
			}

		}
	}

	public static void main(String[] args) throws InterruptedException {

		Demo1 demo1 = new Demo1();
		demo1.datePicker("6", "Feb", "1993");

	}
}
