package session11_19;

import java.awt.Window;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Session17_WindowHandle {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Software\\chromedriver-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(3000);
//		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		Set<String> windows=driver.getWindowHandles();
		Object[] handleWindow=windows.toArray();

		driver.switchTo().window(handleWindow[0].toString());
		Thread.sleep(3000);
		driver.switchTo().window(handleWindow[1].toString());
		Thread.sleep(3000);
		driver.switchTo().window(handleWindow[0].toString());
		Thread.sleep(3000);
		driver.switchTo().window(handleWindow[1].toString());
		Thread.sleep(3000);
		driver.switchTo().window(handleWindow[0].toString());
		Thread.sleep(3000);
		driver.switchTo().window(handleWindow[1].toString());
		Thread.sleep(3000);
		
		driver.close();
		Thread.sleep(3000);
		driver.quit();
		
		/*
		 
		 
		driver.get("https://testautomationpractice.blogspot.com/");
		 driver.findElement(By.xpath("//*[normalize-space()='New Tab']")).click();
		
		String parentWindow=driver.getWindowHandle();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> iterator= windows.iterator();
		Thread.sleep(3000);
		while(iterator.hasNext()) {
			String childWindow=iterator.next();
			if(!parentWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				Thread.sleep(3000);
				System.out.println("Child Window URL name::"+driver.getCurrentUrl());
				driver.close();
			}
		}
		

		Thread.sleep(2000);
		
		driver.switchTo().window(parentWindow);
		driver.close();
		 */
	}

}
