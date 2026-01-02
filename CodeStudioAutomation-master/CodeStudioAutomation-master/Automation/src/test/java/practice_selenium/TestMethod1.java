package practice_selenium;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;



public class TestMethod1 implements IRetryAnalyzer {

	@Override
	public boolean retry(ITestResult result) {
		
		int setLimit=3;
		int faileCount=1;
		
		if(!result.isSuccess()) {
			
			if(faileCount>setLimit) {
				faileCount++;
				return false;
			}
		}
		
		return true;
	}
	
	
	
}

