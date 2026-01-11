package session1_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Session9_radioButtonCount {
	
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		int radioButton=driver.findElements(By.xpath("//*[@type='radio']")).size();
		
		System.out.println(radioButton);

		driver.quit();
	}

}
