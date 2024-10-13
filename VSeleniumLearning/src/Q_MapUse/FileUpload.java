package Q_MapUse;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
static WebDriver driver;
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32 (3)/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.monsterindia.com/seeker/registration");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//*[@class='upload-file']")).click();
//control focus---focus on textbox--(title,text,controlID)--COntrilid-class+instance
			//controlsetText-path of file
			//controlClick--- click on open button
			
			Runtime.getRuntime().exec("D:/script1.exe");
			
	}

}
