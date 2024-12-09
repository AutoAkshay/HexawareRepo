package session11_19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Session13_Alerts {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:\\Software\\chromedriver-win64\\chrome-win64\\chrome.exe");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(3000);
		
		/*
		driver.findElement(By.xpath("//button [@onclick='jsAlert()']")).click();
		driver.switchTo().alert().accept();
		System.out.println("Alert is accepted");
		*/
		
		/*
		driver.findElement(By.xpath("//button [@onclick='jsConfirm()']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();		
		System.out.println("Alert is dismissed");
		*/
		
		driver.findElement(By.xpath("//button [@onclick='jsPrompt()']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Akshay Kalam");	
		driver.switchTo().alert().accept();
		System.out.println("Alert is accepted with message");
		
	}

}
