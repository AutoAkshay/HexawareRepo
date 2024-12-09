package session11_19;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Session12_UploadFile {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:\\Software\\chromedriver-win64\\chrome-win64\\chrome.exe");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://demoqa.com/upload-download");
		
//		driver.findElement(By.xpath("//*[@id='uploadFile']")).sendKeys("C:\\automationTraining\\CodeStudio\\test-output\\failed.png");
		Actions actions=new Actions(driver);
		WebElement click=driver.findElement(By.xpath("//*[@id='uploadFile']"));
		actions.click(click).build().perform();
		Thread.sleep(5000);
		String path="C:\\Users\\2000135863\\git\\RestAssured-master\\RestAssured-master\\me.txt";
		Robot robot=new Robot();
		StringSelection selection=new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

}
