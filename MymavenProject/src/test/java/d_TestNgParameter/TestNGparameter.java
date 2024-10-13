package d_TestNgParameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGparameter {
	WebDriver driver;
	@Parameters("browserName")
	@BeforeTest
	public void OpenBrowser(String browserName) {
		switch (browserName){
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "edge":
			WebDriverManager.chromedriver().setup();
			driver=new EdgeDriver();
			break;
		default:
			break;
		}
		driver.manage().window().maximize();
	}

	private void Switch(String browsername) {
		// TODO Auto-generated method stub

	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

	@Parameters("url")
	@Test
	public void LauchOrangeHRM(String url) {
		driver.get(url);
	}

	@Parameters({"username","password"})
	@Test
	public void Login(String username,String password) {
		driver.findElement(By.name("txtUsername")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();

	}
	
    

 	
     
	
}
// Parameters:Give the information to method when pass the parameter.
// Parameter: parameter mention in in xml file 
// parameter are passed at suite level then these parameters are accessed to all test cases which are under the particular suite.
// parameter are passed at test level then these paramter applicable for particular test.
// what is use of test ng parameter?
//when parameters at suite level as well as test level then test case execute as per the test level parameter.
//