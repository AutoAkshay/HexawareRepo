package session28_EnableAndDisable_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class EnableAndDisable_TestCases {
	
	@Test(enabled = true)
	public void MobileLogin() {
		System.out.println("Mobile Login Personal Loan");
	}
	
	@Test(enabled = false)
	public void WebLogin() {
		System.out.println("Web Login Personal Loan");
	}
	
	@Test
	public void APILogin() {
		System.out.println("API Login Personal Loan");
	}
	
	@Test
	public void MobileLoginAutomationLoan() {
		System.out.println("Mobile Login for automation Loan");
	}
	
	@Test(enabled = false)
	public void WebLoginAutomationLoan() {
		System.out.println("Web Login for automation Loan");
	}
	
	@Test(enabled = true)
	public void APILoginAutomationLoan() {
		System.out.println("API Login for automation Loan");
	}

}
