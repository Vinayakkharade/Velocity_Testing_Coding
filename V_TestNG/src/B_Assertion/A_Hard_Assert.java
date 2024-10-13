package B_Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class A_Hard_Assert {
	public static WebDriver driver;
	@Test(priority=1)
	public void LoginVerify() {
		System.setProperty("webdriver.chrome.driver", "C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#divUsername input")).sendKeys("Admin");
		driver.findElement(By.cssSelector("#divPassword input")).sendKeys("admin123");
		driver.findElement(By.cssSelector("#divLoginButton input")).click();
		String actualtitle=driver.getTitle();
		Assert.assertEquals(actualtitle, "Orange");
		Reporter.log("login is successfully",true);
		driver.findElement(By.xpath("//span[text()='Leave List']")).click();
		System.out.println("leave list is viewed successfully");
	}
	@Test(priority=2)
	public void NewTabOpen() {
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Reporter.log("new tab open successfully ",true);
	}
	
}
