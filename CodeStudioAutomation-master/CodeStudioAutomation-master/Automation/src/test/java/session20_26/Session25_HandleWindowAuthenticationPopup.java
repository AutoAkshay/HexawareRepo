package session20_26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Session25_HandleWindowAuthenticationPopup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:\\Software\\chromedriver-win64\\chrome-win64\\chrome.exe");
		WebDriver driver=new ChromeDriver(options);
		// URL -->  https://admin:admin@the-internet.herokuapp.com/basic_auth
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}
}
