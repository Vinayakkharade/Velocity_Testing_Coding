package TestJava;

import java.io.File;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import mainJava.BaseClass;
import mainJava.LoginPage;

public class BaseTest extends BaseClass{
	
	@BeforeClass
	public void BrowserLaunch() {
	
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	@BeforeClass
	public void objectAllMethods(){
		 logpage=new LoginPage(driver);
	
	}

	@AfterClass 
	public void TearDownEnv() {
		driver.quit();
		
	}
	
}
