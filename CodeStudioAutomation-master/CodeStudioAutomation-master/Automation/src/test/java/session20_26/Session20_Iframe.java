package session20_26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Session20_Iframe {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Software\\chromedriver-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		WebElement singleWindow=driver.findElement(By.xpath("//*[@id='singleframe']"));
		Thread.sleep(2000);
		driver.switchTo().frame(singleWindow);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("WelCome");
		
//		driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
//		WebElement multiFrame= driver.findElement(By.xpath("//*[@id='Multiple']/iframe"));
//
//		Thread.sleep(5000);
//		driver.switchTo().frame(multiFrame);
//		
//		WebElement singleFrame= driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
//		driver.switchTo().frame(singleFrame);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("WelCome");
	}

}
