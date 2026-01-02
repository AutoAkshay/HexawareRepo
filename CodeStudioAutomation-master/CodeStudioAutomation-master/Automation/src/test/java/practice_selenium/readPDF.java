package practice_selenium;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class readPDF {

	@Test
	public void test() throws InterruptedException, IOException {

		
		File file=new File("src/test/java/practice_selenium/Name.pdf");
		PDDocument document=PDDocument.load(file);
		
		PDFTextStripper pdfTextStripper=new PDFTextStripper();
		
		String str=pdfTextStripper.getText(document);
		
		System.out.println(str);

	}

}
