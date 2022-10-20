package pom_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB_Login_Page {
	
	public FB_Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//*[@name='email']")private WebElement UserName;
	
	@FindBy (xpath = "//input[@name='pass']")private WebElement Password;
	
	@FindBy(xpath = "//button[text()='Log in']")private WebElement ClickToLogin;
	

	
	public void FB_Login_Page_EnterUserName(String name) throws InterruptedException {
		Thread.sleep(2000);
		UserName.sendKeys(name);
	}
	
	public void FB_Login_Page_EnterPassword(String pass) throws InterruptedException {
		Thread.sleep(2000);
		Password.sendKeys(pass);
	}
	
	public void FB_Login_Page_Click_LogInButton() {
		ClickToLogin.click();
	}
	
	
	
	
	
	
}
