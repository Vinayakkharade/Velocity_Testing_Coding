package a9autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Prc1 {
	public static void main(String[]args) throws IOException
	{
		System.setProperty("webdriver.gecko.driver","C:/SOFTWARE/Selenium/Browser/geckodriver-v0.30.0-win64/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
	  
	    //driver.findElement(By.className("file_upload")).click();
		
		WebElement button=driver.findElement(By.className("file_upload"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", button);
	    Runtime.getRuntime().exec("D://Testing Study Material//selenium study/autolit//script.exe"+""+"D://group//mock result//2nd.jpeg");
	    
	}
}//Runtime.getRuntime().exec("path of autoit script"+""+"path of file which we have to upload")

