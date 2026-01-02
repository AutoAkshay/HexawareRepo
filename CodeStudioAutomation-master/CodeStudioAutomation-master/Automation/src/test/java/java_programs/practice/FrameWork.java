package java_programs.practice;

import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.skyscreamer.jsonassert.JSONAssert;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import practice_selenium.RetryAnalyzer;

@Listeners(TestNGListener.class)
public class FrameWork extends BaseTest {

	@Test(priority=1,dataProvider = "quantity", dataProviderClass = QuantityProvider.class, retryAnalyzer = RetryFailedCase.class)
	public void marketPlace(String quantityInKG) throws IOException {
		helper = new CommonHelper(driver);

		driver.get(propertiesFile.readURL());

		helper.scrollToElement(By.xpath(Locators.apple));

		WebElement increment = driver.findElement(By.xpath(Locators.increment));
		WebElement qunatity = driver.findElement(By.xpath(Locators.quantity));

		while (true) {
			if (qunatity.getAttribute("value").equals(quantityInKG)) {
				helper.clickOnElement(By.xpath(Locators.apple));
				break;
			}

			else {
				increment.click();
			}
		}

		helper.clickOnElement(By.xpath(Locators.cart));

		helper.clickOnElement(By.xpath(Locators.proceedToCheckOut));

		helper.sendKeys(By.xpath(Locators.promoCode), "rahulshettyacademy");

		helper.clickOnElement(By.xpath(Locators.promoApply));

		helper.assertionText(By.xpath(Locators.promoInfo), "Code applied ..!");

		helper.clickOnElement(By.xpath(Locators.placeOrder));

		helper.dropDownList(By.xpath(Locators.countryDropDown), "India");

		helper.clickOnElement(By.xpath(Locators.radioButton));

		helper.clickOnElement(By.xpath(Locators.proceedButton));

	}
	
	@Test(priority=2, retryAnalyzer = RetryFailedCase.class)
	public void webTableValidation() throws IOException, InterruptedException {
		helper = new CommonHelper(driver);

		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(3000);
		
		List<WebElement> row=driver.findElements(By.xpath("//table[@name='']//tbody//t"));
		List<WebElement> head=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//th"));
		helper.clickOnElement(By.id(""));
		
		System.out.println("Row size::"+row.size());
		System.out.println("Row size::"+head.size());
		
		for (int i = 2; i <= row.size(); i++) {
			for (int j = 1; j <= head.size(); j++) {
				String dataTable=driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr["+i+"]//td["+j+"]")).getText();
				System.out.println(dataTable);
			}
			
			System.out.println();
		}

	}
}
