package J_Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class A_Screenshot {
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://jqueryui.com/slider/");
			driver.manage().window().maximize();

			TakesScreenshot scrshot=(TakesScreenshot)driver;
			
			File source=scrshot.getScreenshotAs(OutputType.FILE);
			File Destination=new File("D:\\VELOCITY\\STUDY MATERIAL\\AUTOMATION\\screenshot\\8jan.jpeg");
			FileHandler.copy(source, Destination);
			Thread.sleep(2000);
	}

}
