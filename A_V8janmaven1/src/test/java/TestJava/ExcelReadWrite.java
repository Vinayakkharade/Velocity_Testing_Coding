package TestJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelReadWrite {
	public void ExcelRead() throws IOException {
		FileInputStream load=new FileInputStream("D://Testing Study Material//test data//1.xlsx");
		XSSFWorkbook workbook =new XSSFWorkbook(load);
	}
public static WebDriver driver;
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	
	
	

	}

}
