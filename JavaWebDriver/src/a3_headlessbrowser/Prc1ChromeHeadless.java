package a3_headlessbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Prc1ChromeHeadless {
public static void main(String[]args)
{
	System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Selenium/Browser/chromedriver_win32 (1)/chromedriver.exe");
	ChromeOptions options=new ChromeOptions();/// object created for chrome browser.
	options.setHeadless(true);     // Headless property
	/// if true---we cannot see the UI page
	/// if false---we see the UI page
	
	WebDriver driver=new ChromeDriver(options); // invoke the chrome browser.
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
}
}
// headless --- we cannot set the UI page.process is happened at backend.
