package base_utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility_Class {
	WebDriver driver;
	
	public Utility_Class(WebDriver driver1) {
		driver=driver1;
	}
	
	public String Excel_Sheetdata(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Amir\\Desktop\\Excel_File\\amir.xlsx");
		Sheet sheeet = WorkbookFactory.create(file).getSheet("Sheet1");
		Cell celll = sheeet.getRow(rowIndex).getCell(cellIndex);
		try {
			return celll.getStringCellValue();
		} catch (Exception e) {
			return	celll.getNumericCellValue()+"";
		}
	}

	
	public void Take_ScreenShot(String TC_Name) throws IOException {
		Date d = new Date();
		DateFormat df = new SimpleDateFormat("_hh_mm_ss_dd_MM_yyyy");
		String dateTime=df.format(d);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Java data\\Maven_FrameWork\\Maven_ScreenShots\\"+TC_Name+dateTime+".jpg");
		FileHandler.copy(src, dest);
	}
}
