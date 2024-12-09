package java_programs.stringCodes;

import java.awt.Color;
import java.awt.Dimension;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CharCountWithoutMap {

	@Test
	public void test() {
		
		String str = "Akshay Anil Kalam Akshay Anil Kalam";
		
		int[] charCounts = new int[256]; // Assuming ASCII characters
		
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.toLowerCase().charAt(i);
			charCounts[c]++;
		}

		for (int i = 0; i < charCounts.length; i++) {
			if (charCounts[i] > 0) {
				System.out.println((char)i+":"+charCounts[i]);
			}
		}
	}
}
