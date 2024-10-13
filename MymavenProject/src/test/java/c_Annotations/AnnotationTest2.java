package c_Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AnnotationTest2 {
WebDriver driver;
	@BeforeTest
	public void OpenBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	@Test
	public void LauchOrangeHRM() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@Test
	public void Login() {
		driver.findElement(By.name("txtUsername")).sendKeys("Admin ");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		
	}
	
}





