package I_CrossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class debug {

	WebDriver driver =null;
	@Test
	public void BrowserLunch() {
		System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.facebook.com/login/");
        String titlePage=driver.getTitle();
        if(titlePage.equals("Log in to Facebook"))
        	System.out.println("title is OK");
        
        else
        	System.out.println("title is NotOK");
	}
	@Test
	public void TearDownBrowser() {
		driver.close();
	}
	
}
