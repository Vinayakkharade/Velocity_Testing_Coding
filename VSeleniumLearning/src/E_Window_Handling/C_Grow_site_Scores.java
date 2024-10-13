package E_Window_Handling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_Grow_site_Scores {
	static WebDriver driver;
	public static void SCORESLaunch() throws InterruptedException {
		String primaryID=driver.getWindowHandle();

		driver.findElement(By.xpath("//*[text()='SCORES']")).click();
		Set<String>SecondaryIDS=driver.getWindowHandles();

		for(String singleID:SecondaryIDS) {
			if(!primaryID.equals(singleID)) {
				Thread.sleep(2000);
				driver.switchTo().window(singleID);
				driver.findElement(By.cssSelector("#ctl00_TopMenu1_lnkaboutus")).click();
				Thread.sleep(2000);
				//	driver.close();
			}
		}
		driver.switchTo().window(primaryID);
	}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");

		driver=new ChromeDriver();
		driver.get("https://groww.in/");
		driver.manage().window().maximize();
		C_Grow_site_Scores window=new C_Grow_site_Scores();
		window.SCORESLaunch();
	}
}
