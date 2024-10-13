package B_Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C_Run_Fail_testcase {
	static WebDriver driver;
	@Test(priority=1)
	public void loginVerify() {
		System.setProperty("webdriver.chrome.driver", "C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#divUsername input")).sendKeys("Admin");
		driver.findElement(By.cssSelector("#divPassword input")).sendKeys("admin123");
		driver.findElement(By.cssSelector("#divLoginButton input")).click();
		String actualtitle=driver.getTitle();
		SoftAssert as=new SoftAssert();
		as.assertEquals(actualtitle, "OrangeHRM");
		System.out.println("login is succsssfully");
		driver.findElement(By.xpath("//span[text()='Leave List']")).click();
		as.assertAll();
	}
	
	@Test(priority=2)
	public void NewTabOpen() {
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Reporter.log("new tab open successfully ",true);
	}
}
