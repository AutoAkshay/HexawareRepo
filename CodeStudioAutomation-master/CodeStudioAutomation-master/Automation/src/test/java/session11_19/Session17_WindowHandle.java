package session11_19;

import java.awt.Window;
import java.util.Set;

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
	}

}
