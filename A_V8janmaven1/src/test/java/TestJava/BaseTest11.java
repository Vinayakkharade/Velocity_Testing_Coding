package TestJava;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import MainJava.BaseClass11;
import MainJava.DashBoardPageClass;
import MainJava.LoginPageClass;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest11 extends BaseClass11 {
	@BeforeClass
	public void BrowserLaunch() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOption	= new ChromeOptions();
		chromeOption.addArguments("--start-maximized");
		driver = new ChromeDriver(chromeOption);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	//STCM  --------
	@BeforeMethod
	public void allPageObjects() {
		loginPage = new LoginPageClass(driver);	
		Dasboard = new DashBoardPageClass(driver);
	}
	
	
	
	@AfterClass
	public void tearDownBrowser() {
		driver.quit();
	}
}
