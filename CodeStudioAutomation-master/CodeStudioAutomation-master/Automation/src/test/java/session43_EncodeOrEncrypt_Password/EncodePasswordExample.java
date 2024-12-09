package session43_EncodeOrEncrypt_Password;


import org.apache.commons.codec.binary.Base16;
import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EncodePasswordExample {
	
	public static void main(String[] args) throws InterruptedException {
		
//		String password="admin123";
//		byte[] encodePassword=Base64.encodeBase64( password.getBytes());
//		System.out.println(new String(encodePassword));
		//reult= YWRtaW4xMjM=
		System.setProperty("webDriver.Chrome.driver", "C:\\Software\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Software\\chromedriver-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		byte[] decode=Base64.decodeBase64("YWRtaW4xMjM=");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys(new String(decode));
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
	

}
