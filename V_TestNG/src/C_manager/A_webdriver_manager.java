package C_manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A_webdriver_manager {
	 public static WebDriver driver;
	@Test(priority=1)
	public void login() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.cssSelector("#divUsername input")).sendKeys("Admin");
		driver.findElement(By.cssSelector("#divPassword input")).sendKeys("admin123");
		driver.findElement(By.cssSelector("#divLoginButton input")).click();
		Reporter.log("login is successfully",true);
	}
	@Test(priority=2)
	public void NewTabOpen() {
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Reporter.log("new tab open successfully ",true);
	}
}
