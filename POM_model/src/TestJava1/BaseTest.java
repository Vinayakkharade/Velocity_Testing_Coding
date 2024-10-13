package TestJava1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import MainJava1.BaseClass;
import MainJava1.DashBoardPage;
import MainJava1.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest extends BaseClass {
	
	@BeforeClass
	public void BrowserLaunching() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
   @BeforeClass
   public void object() {
	  loginP=new LoginPage(driver);
	  Dashboard=new DashBoardPage(driver);
   }
	
	@AfterClass
	public void TearDown() {
		driver.quit();
	}
}
