package A_testcase_execution_sequence;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class I_DependsOnMethod {
	public static WebDriver driver;
	@Test(priority=0,dependsOnMethods="testcase2")
	public void testcase1() {
		System.setProperty("webdriver.chrome.driver", "C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#divUsername input")).sendKeys("Admin");
		String acualTitle=driver.getTitle();
		//SoftAssert as=new SoftAssert();
		//as.assertEquals(acualTitle, "Orange");
		//as.assertAll();
		System.out.println("testcase1");
		
	}
	
	@Test(priority=1,dependsOnMethods="testcase1")
	public void testcase2() {
		driver.findElement(By.cssSelector("#divPassword input")).sendKeys("admin123");
		System.out.println("testcase2");
	}
	

}
