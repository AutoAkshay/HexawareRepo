package session11_19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Session14_WebTable {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:\\Software\\chromedriver-win64\\chrome-win64\\chrome.exe");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(3000);
		
		List<WebElement> row=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr"));
		List<WebElement> head=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//th"));
		
		System.out.println("Row size::"+row.size());
		System.out.println("Row size::"+head.size());
		
		for (int i = 2; i <= row.size(); i++) {
			for (int j = 1; j <= head.size(); j++) {
				String dataTable=driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr["+i+"]//td["+j+"]")).getText();
				System.out.println(dataTable);
			}
			
			System.out.println();
			
		}
	}

}
