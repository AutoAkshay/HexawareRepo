package session1_9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Session6_DropDown {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver", "C:\\Software\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:\\Software\\chromedriver-win64\\chrome-win64\\chrome.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		
		Select select;
		select=new Select(driver.findElement(By.name("CompanyCountry")));
		select.selectByVisibleText("Afghanistan");
		
		Select select2;
		select2=new Select(driver.findElement(By.name("CompanyEmployees")));
		select2.selectByVisibleText("2001+ employees");
		
		List<WebElement> countrylist=driver.findElements(By.xpath("//*[@name='CompanyCountry']//option"));
		
		for(WebElement countries:countrylist) {
			System.out.println(countries.getText());
		}
	}

}
