package session11_19;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import ch.qos.logback.core.util.FileUtil;

public class Session16_ScreenShots {
	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Software\\chromedriver-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(5000);
//		TakesScreenshot screenshot = (TakesScreenshot) driver;
//		File file = screenshot.getScreenshotAs(OutputType.FILE);
		//screenshot of particular element
		WebElement element=driver.findElement(By.xpath("//img[@class='wikipedia-icon']"));
		File file = element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\automationTraining\\CodeStudio\\target\\practice.png"));

	}
}
