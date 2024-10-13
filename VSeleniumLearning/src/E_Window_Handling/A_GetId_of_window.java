package E_Window_Handling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_GetId_of_window {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");

		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		String currentwinID=driver.getWindowHandle();
		System.out.println(currentwinID);

		driver.findElement(By.xpath("//*[@id='footer']//following::a[text()='OrangeHRM, Inc']")).click();

		Set<String>allwnindowID=driver.getWindowHandles();
		for(String singleID:allwnindowID)
			System.out.println(singleID);

	}
}
