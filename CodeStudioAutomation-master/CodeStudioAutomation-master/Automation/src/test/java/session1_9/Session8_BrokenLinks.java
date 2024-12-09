package session1_9;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Session8_BrokenLinks {

	public static void main(String[] args) throws IOException {

		System.setProperty("webDriver.Chrome.driver", "C:\\Software\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Software\\chromedriver-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.get("http://www.deadlinkcity.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		int resCode = 200;
		int brokenLink = 0;
		for (WebElement we : links) {
			String url = we.getAttribute("href");

			try {
				URL urlLinks = new URL(url);
				HttpURLConnection huc = (HttpURLConnection) urlLinks.openConnection();
				huc.setRequestMethod("HEAD");
				huc.connect();

				resCode = huc.getResponseCode();

				if (resCode >= 400) {
					System.out.println(url + " Broken link");
					brokenLink++;
				}
			}

			catch (MalformedURLException e) {

			}

			catch (Exception e) {

			}

		}

		System.out.println("Broken Link" + brokenLink);
	}

}
