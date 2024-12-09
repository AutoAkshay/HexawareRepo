package session50_imageSource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ImageSource {
	
	//retrieve image source
	public static void main(String[] args) {
		
		System.setProperty("webDriver.Chrome.driver", "C:\\Software\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Software\\chromedriver-win64\\chrome-win64\\chrome.exe");
		WebDriver driver=new ChromeDriver(options);
		
		
		driver.get("https://www.google.com/");
		WebElement element=driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		String imageSource=element.getAttribute("src");
		
		System.out.println("Image Source::"+imageSource);
	}

}
