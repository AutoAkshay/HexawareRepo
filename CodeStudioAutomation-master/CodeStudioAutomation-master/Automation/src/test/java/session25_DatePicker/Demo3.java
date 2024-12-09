package session25_DatePicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo3 {

	public void datePicker(String expectedDate,String expectedMonth,String expectedYear) throws InterruptedException {

		System.setProperty("webdriver.driver.com", "C:\\Software\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Software\\chromedriver-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/datepicker/");
		WebElement iframe = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(iframe);
		Thread.sleep(5000);
		driver.findElement(By.id("datepicker")).click();

		while (true) {

			String calendarMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			String calendarYear = driver.findElement(By.className("ui-datepicker-year")).getText();

			if (expectedMonth.equals(calendarMonth) && expectedYear.equals(calendarYear)) {
				List<WebElement> dayList = driver.findElements(By.xpath("//table//tbody//tr//td"));

				for (WebElement e : dayList) {
					String calendarDay = e.getText();

					if (expectedDate.equals(calendarDay)) {
						e.click();
						break;
					}
				}

				break;
			}

			else {
				driver.findElement(By.xpath("//*[normalize-space()='Next']")).click();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		Demo3 datePicker=new Demo3();
		
		datePicker.datePicker("4","December","2024");
	}

}
