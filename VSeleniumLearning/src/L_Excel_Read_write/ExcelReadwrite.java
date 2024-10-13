package L_Excel_Read_write;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelReadwrite {
	public static void ExcelRead() throws IOException{
		FileInputStream loads=new FileInputStream("123.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(loads);
		XSSFSheet sheet=book.getSheetAt(0);
		String s1=sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.print(s1);
	}
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32 (3)/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();

	 ExcelRead();
	}

		}

	


