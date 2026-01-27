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
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/upload-download");
		//this is normal way of uploading file
//		driver.findElement(By.xpath("//*[@id='uploadFile']")).sendKeys("/Users/akshayakalam/me.txt");
		Actions actions=new Actions(driver);
		WebElement click=driver.findElement(By.xpath("//*[@id='uploadFile']"));
		actions.click(click).build().perform();
		Thread.sleep(5000);
		String path="/Users/akshayakalam/me.txt";
		Robot robot=new Robot();
		StringSelection selection=new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

//		robot.setAutoDelay(500);

// Paste using COMMAND + V (macOS)
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

// Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
