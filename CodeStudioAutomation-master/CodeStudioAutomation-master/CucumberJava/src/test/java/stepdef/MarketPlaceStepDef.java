package stepdef;

import drivers.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.CommonHelper;
import utility.Locators;

import java.util.List;
import java.util.Map;


public class MarketPlaceStepDef {
    public WebDriver driver;
    public CommonHelper helper;

    public MarketPlaceStepDef() {
        driver=DriverFactory.getDriver();
        helper=new CommonHelper(driver);
    }


    @Given("the user launches the marketplace application")
    public void the_user_launches_the_marketplace_application() {
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    }
    @When("the user adds {string} apples to the cart")
    public void theUserAddsApplesToTheCart(String qty) {
        helper.scrollToElement(By.xpath(Locators.addToCart));
        WebElement increment = driver.findElement(By.xpath(Locators.increment));
        WebElement quantity = driver.findElement(By.xpath(Locators.quantity));

        while (true) {
            if (quantity.getAttribute("value").equals(qty)) {
                helper.clickOnElement(By.xpath(Locators.addToCart));
                break;
            }

            else {
                increment.click();
            }
        }
    }

    @When("the user opens the cart")
    public void the_user_opens_the_cart() {
        helper.clickOnElement(By.xpath(Locators.cart));
    }
    @When("the user proceeds to checkout")
    public void the_user_proceeds_to_checkout() {
        helper.clickOnElement(By.xpath(Locators.proceedToCheckOut));


    }
    @When("the user applies a valid promo code")
    public void the_user_applies_a_valid_promo_code() throws InterruptedException {
        helper.sendKeys(By.xpath(Locators.promoCode), "rahulshettyacademy");
        helper.clickOnElement(By.xpath(Locators.promoApply));

        helper.assertionText(By.xpath(Locators.promoInfo), "Code applied ..!");

    }
    @When("the user places the order")
    public void the_user_places_the_order() {
        helper.clickOnElement(By.xpath(Locators.placeOrder));
    }
    @When("the user selects a country and accepts the terms and conditions")
    public void the_user_selects_a_country_and_accepts_the_terms_and_conditions() {
        helper.dropDownList(By.xpath(Locators.countryDropDown), "India");
        helper.clickOnElement(By.xpath(Locators.radioButton));
    }
    @Then("the order should be placed successfully and the browser is closed")
    public void the_order_should_be_placed_successfully_and_the_browser_is_closed() {
        helper.clickOnElement(By.xpath(Locators.proceedButton));
        DriverFactory.quitDriver();
    }

    @When("the user adds apples to the cart")
    public void theUserAddsApplesToTheCart(DataTable table) {
        List<Map<String,String>> qty=table.asMaps(String.class,String.class);
        helper.scrollToElement(By.xpath(Locators.addToCart));
        WebElement increment = driver.findElement(By.xpath(Locators.increment));
        WebElement quantity = driver.findElement(By.xpath(Locators.quantity));

        while (true) {
            if (quantity.getAttribute("value").equals(qty.get(0).get("Qty"))) {
                helper.clickOnElement(By.xpath(Locators.addToCart));
                break;
            }

            else {
                increment.click();
            }
        }
    }
}
