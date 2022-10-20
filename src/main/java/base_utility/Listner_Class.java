package base_utility;
	
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listner_Class implements ITestListener{
		WebDriver driver;
		Utility_Class util =  new Utility_Class(driver);
		
		public void onTestFailure(ITestResult result) {
			Reporter.log("Failure Block of Code Running");
		}
		
		public void onTestSuccess(ITestResult result) {
			Reporter.log("Success Block of Code Running");
			try {
				util.Take_ScreenShot(result.getName());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public void onTestSkipped(ITestResult result) {
			Reporter.log("Skipped Block of Code Running");
		}

	}



