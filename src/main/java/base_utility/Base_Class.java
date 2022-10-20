package base_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.asserts.SoftAssert;


public class Base_Class {
	
	public static WebDriver driver;
	public static SoftAssert SA;
	public static Utility_Class util;
	
	public static void Initialize() {
		SA = new SoftAssert();
		util = new Utility_Class(driver);
		
	}
	
	public static void Launch_Browser(String Browser_Name) {
		
			if (Browser_Name.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Java data\\Automation_Tools\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} 
		else if(Browser_Name.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Java data\\Automation_Tools\\Selenium\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
//			driver.manage().window().maximize();
			
			driver.get("https:\\www.facebook.com/");
	}
	
	public static void Quit_Browser() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	
	public static void Wait_Browser(int sec) throws InterruptedException {
		Thread.sleep(sec*1000);
	}

}


}
