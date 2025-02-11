package A_launchbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class B_BrowserStartup_initialization {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","C:/SOFTWARE/Selenium/Browser/geckodriver-v0.30.0-win64/geckodriver.exe");
	
		String browser="chrome";
		
		if(browser.equalsIgnoreCase("chrome"))
		  driver=new ChromeDriver();
		
		if (browser.equalsIgnoreCase("firefox"))
			driver=new FirefoxDriver();
		
	
		driver.get("https://www.youtube.com/");// navigate the url & wait till page is loading
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();// maximize the window of browser
		
		driver.navigate().back();// it return or naviagate the previous page
		Thread.sleep(2000);
		
		driver.navigate().forward(); /// it going to next page
		driver.navigate().refresh();
	     driver.close();// it closes the tab
		 driver.quit();// it closes the browser which is we are handling
	}
}
