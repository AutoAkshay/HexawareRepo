package utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CommonHelper {

	private final WebDriver driver;
	private final WebDriverWait wait;
	private static Logger logger;

	public CommonHelper(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		logger = LogManager.getLogger(CommonHelper.class);
	}

	public void clickOnElement(By locator) {
		logger.info("Attempting to click on element :: {}", locator);
		try {

			wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
			logger.info("Successfully clicked on element :: {}", locator);
		} catch (Exception e) {

			logger.error("Failed to click on element :: {}", locator, e);
			throw new RuntimeException("Failed to click the element::" + locator, e);
		}

	}

	public void scrollToElement(By locator) {
		logger.info("Attempting to scroll to element :: {}", locator);
		Actions actions = new Actions(driver);
		try {

			actions.scrollToElement(wait.until(ExpectedConditions.visibilityOfElementLocated(locator)))
					.perform();
			logger.info("Successfully scrolled to element :: {}", locator);
		} catch (Exception e) {
			logger.error("Failed to scrollToElement :: {}", locator, e);
			throw new RuntimeException("Failed to scroll to element::" + locator, e);
		}

	}

	public void dropDownList(By locator, String visibleText) {
		logger.info("Attempting to find the dropdown list :: {}", locator);
		try {

			Select select = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(locator)));
			select.selectByVisibleText(visibleText);
			logger.info("Successfully found the dropdown list :: {}", locator);

		} catch (Exception e) {
			logger.error("Failed to find the dropdown list :: {}", locator, e);
			throw new RuntimeException("Failed to locate dropdown list::" + locator, e);
		}

	}

	public void sendKeys(By locator, String text) {
		logger.info("Attempting to send the keys :: {}", locator);
		try {

			WebElement we = wait.until(ExpectedConditions.elementToBeClickable(locator));
			we.clear();
			we.sendKeys(text);
			logger.info("Successfully sent the keys:: {}", locator);
		} catch (Exception e) {
			logger.error("Failed to sent the keys :: {}", locator, e);
			throw new RuntimeException("Failed to locate input box::" + locator, e);
		}

	}

	public void assertionText(By locator, String expected) {
		logger.info("Attempting to assert the elemet :: {}", locator);
		try {
			String actual = wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
			Assert.assertEquals(actual, expected);
			logger.info("Actual text found :: {}" , actual);
		} catch (Exception e) {
			logger.error("Failed to assert the element :: {}", locator, e);
			throw new RuntimeException("Assertion failed for element::" + locator, e);
		}

	}
	
	public void takeScreenShot() {
		 String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		File path=new File("./src/test/java/java_programs/practice/failedTestCaseScreenshot/"+"FailedInstance"+timestamp+".png");
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(file, path);
			 logger.info("Screenshot captured at :: {}", path);
		} catch (IOException e) {
			logger.error("Failed to capture screenshot", e);
		}
	}
}
