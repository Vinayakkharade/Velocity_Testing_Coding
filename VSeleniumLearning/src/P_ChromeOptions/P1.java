package P_ChromeOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32 (3)/chromedriver.exe");

		driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			
			
	}
}
