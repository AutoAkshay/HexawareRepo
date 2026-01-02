package java_programs.practice;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	
public static String apple=	"//div//h4[normalize-space()='Apple - 1 Kg']//following-sibling::div/button[@type='button']";
public static String increment="//div//h4[normalize-space()='Apple - 1 Kg']//following-sibling::div//a[@class='increment']";
public static String quantity="//div//h4[normalize-space()='Apple - 1 Kg']//following-sibling::div//input[@class='quantity']";
public static String cart="//*[@alt='Cart']";
public static String proceedToCheckOut="//button[normalize-space()='PROCEED TO CHECKOUT']";
public static String placeOrder="//button[normalize-space()='Place Order']";
public static String radioButton="//input";
public static String proceedButton="//button[normalize-space()='Proceed']";
public static String countryDropDown="//select";
public static String promoCode="//input[@class='promoCode']";
public static String promoApply="//button[normalize-space()='Apply']";
public static String promoBtn="//button[@class='promoBtn']";
public static String promoInfo="//*[@class='promoInfo']";

}


