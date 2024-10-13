package A_launchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F_CSS_Selector {
	static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
// id is fastest locator.
	System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	//CSS selector is faster than x-path (CSS selector we are using apart from css selector)
	// CSS selector select the HTTP element using id,classname
	
	driver.findElement(By.cssSelector("#divUsername input")).sendKeys("Admin");
	driver.findElement(By.cssSelector("#divPassword input")).sendKeys("admin123");
	driver.findElement(By.cssSelector("#divLoginButton input")).click();
	
	driver.findElement(By.cssSelector("#branding a img")).click();
	System.out.println(driver.getTitle());

	driver.quit();
}
}
