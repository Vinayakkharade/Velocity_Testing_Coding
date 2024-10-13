package L_Excel_Read_write;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class E_Excel_read_write_ScreenShot_Utility { 
	static WebDriver driver;
	public static void screenshot(String path) throws IOException {
		TakesScreenshot shot=(TakesScreenshot)driver;
		File source=shot.getScreenshotAs(OutputType.FILE);
		File destination=new File(path);
		FileHandler.copy(source, destination);
	}

	public void readWrite(int sheet1,int rowNum1,int Cellnum1,int rowNum2,int Cellnum2,String value,String excelPath ) throws IOException {
		//get the path of excel file
		File path=new File(excelPath);

		//load the file for execution using fileinputstream
		FileInputStream	load=new FileInputStream(path);

		//Access the workbook of excel file
		XSSFWorkbook workbook=new XSSFWorkbook(load);

		// access the sheet for read
		XSSFSheet sheet=workbook.getSheetAt(sheet1);
		String reading=sheet.getRow(rowNum1).getCell(Cellnum1).getStringCellValue();
		System.out.println(reading);

		//access sheet for write
		FileOutputStream write1=new FileOutputStream(path);
		sheet.createRow(rowNum2).createCell(Cellnum2).setCellValue(value);
		workbook.write(write1);
	}

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");

		driver=new ChromeDriver();
		driver.get("https://chercher.tech/java/pop-ups-selenium-webdriver");
		driver.manage().window().maximize();

		E_Excel_read_write_ScreenShot_Utility screen=new E_Excel_read_write_ScreenShot_Utility();

		screen.screenshot("D:\\VELOCITY\\STUDY MATERIAL\\AUTOMATION\\screenshot\\capture1.jpeg");

		screen.readWrite(0,0,0,1,1,"kharade","D:\\VELOCITY\\STUDY MATERIAL\\AUTOMATION\\screenshot\\excel\\data.xlsx");
	}

}
