package hybridFramework.testCases;

import hybridFramework.baseTest.BaseTest;
import hybridFramework.dataProvider.QuantityProvider;
import hybridFramework.listeners.TestNGListener;
import hybridFramework.locator.Locators;
import hybridFramework.retryAnalyzer.RetryFailedCase;
import hybridFramework.utilities.CommonHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

@Listeners(TestNGListener.class)
public class FrameWork extends BaseTest {

	@Test(priority=1,dataProvider = "quantity", dataProviderClass = QuantityProvider.class, retryAnalyzer = RetryFailedCase.class)
	public void marketPlace(String quantityInKG) throws IOException {
		helper = new CommonHelper(driver);

		driver.get(propertiesFile.readURL());

		helper.scrollToElement(By.xpath(Locators.apple));

		WebElement increment = driver.findElement(By.xpath(Locators.increment));
		WebElement quantity = driver.findElement(By.xpath(Locators.quantity));

		while (true) {
			if (quantity.getAttribute("value").equals(quantityInKG)) {
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
		
		List<WebElement> row=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr"));
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
