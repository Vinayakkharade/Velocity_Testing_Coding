package E_Window_Handling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_Handling_2Window {
	static WebDriver driver;

	public void WindowHandling()throws InterruptedException {
		String PrimaryID=driver.getWindowHandle();
		
		
		driver.findElement(By.xpath("//*[@id='footer']//following::a[text()='OrangeHRM, Inc']")).click();

		Set<String>allwnindowID=driver.getWindowHandles();
		for(String singleID:allwnindowID) {
			driver.switchTo().window(singleID);
			System.out.print(singleID);
			if(driver.getTitle().equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS"))
				driver.findElement(By.xpath("//*[@class='btn-orange contact-ohrm ']")).click();
			
			if(driver.getTitle().equals("Contact OrangeHRM"))
				driver.close();
		}
		driver.switchTo().window(PrimaryID);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");

		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		String currentwinID=driver.getWindowHandle();
		System.out.println(currentwinID);

		B_Handling_2Window window=new B_Handling_2Window();
		window.WindowHandling();


	}
}
