package session39_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EncapsulationOfElement {
	
	WebDriver driver;
	
	EncapsulationOfElement(WebDriver d) {
		driver=d;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "user-name")
	private WebElement userName;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(name = "login-button")
	private WebElement button;
	
	public void username(String uname) {
		userName.sendKeys(uname);
	}
	
	public void password(String pswrd) {
		password.sendKeys(pswrd);
	}
	
	public void button() {
		button.click();
	}
}

