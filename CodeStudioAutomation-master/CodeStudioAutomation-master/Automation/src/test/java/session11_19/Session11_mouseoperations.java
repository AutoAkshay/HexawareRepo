package session11_19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Session11_mouseoperations {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:\\Software\\chromedriver-win64\\chrome-win64\\chrome.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		/*
		driver.get("https://demoqa.com/buttons");
		
		WebElement singleClick= driver.findElement(By.linkText("Click Me"));
		WebElement doubleClick= driver.findElement(By.id("doubleClickBtn"));
		WebElement rightClick= driver.findElement(By.id("rightClickBtn"));
		
		
		
		
		// double click
//		actions.doubleClick(doubleClick).build().perform();
		
		//right button click
//		actions.contextClick(rightClick).build().perform();
		
		//single click
//		actions.click(singleClick).build().perform();
 
 */
		
		/*
		//drag and drop
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(5000);
		WebElement source=driver.findElement(By.xpath("//div[@id='box4']"));
		WebElement target=driver.findElement(By.xpath("//div[@id='box106']"));
		actions.dragAndDrop(source, target).build().perform();
		*/
		
		//mouse over
		
		driver.get("https://www.flipkart.com/");
		WebElement login=driver.findElement(By.xpath("//*[@title='Login']"));
		Thread.sleep(5000);
		actions.moveToElement(login).build().perform();
	}

}
