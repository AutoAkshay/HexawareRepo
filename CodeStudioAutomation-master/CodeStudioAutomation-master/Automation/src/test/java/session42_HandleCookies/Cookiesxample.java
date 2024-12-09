package session42_HandleCookies;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import session39_PageFactory.EncapsulationOfElement;

public class Cookiesxample {

	@Test
	public void cookieDemo() {

		System.setProperty("webDriver.Chrome.driver", "C:\\Software\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Software\\chromedriver-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		// add customizedCookie

		Set<Cookie> cookies = driver.manage().getCookies();

		System.out.println(" Size of the cookies Before Adding::" + cookies.size());

		// Each loop to retrieve the name and value of every cookies
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName() + "::" + cookie.getValue());
		}

		System.out.println("==============================================================");
		
//		fetch value of cookie with
//		System.out.println(driver.manage().getCookieNamed("at"));
		
		Cookie customizedCookie = new Cookie("Test", "www.flipkart.com/");
		driver.manage().addCookie(customizedCookie);

		Set<Cookie> cookies2 = driver.manage().getCookies();

		System.out.println(" Size of the cookies After Adding::" + cookies2.size());

		for (Cookie cookie : cookies2) {
			System.out.println(cookie.getName() + "::" + cookie.getValue());
		}
		
		System.out.println("==============================================================");
		// after delete cookie
		driver.manage().deleteCookieNamed("Test");

		Set<Cookie> cookies3 = driver.manage().getCookies();

		System.out.println(" Size of the cookies After deleting::" + cookies2.size());

		for (Cookie cookie : cookies3) {
			System.out.println(cookie.getName() + "::" + cookie.getValue());
		}
	}

}
