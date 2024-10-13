package P_ChromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class A_chromeOptions {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
 System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32 (3)/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		DesiredCapabilities desired=new DesiredCapabilities();
		//String version=desired.getVersion();
		//desired.setVersion("101.0.4951.54");
		
		String browsername=desired.getBrowserName();
		
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		//options.addArguments("--headless");
		options.addArguments("--disble-extensions");
		options.addArguments("--disble-pop-up-blocking");
		driver=new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		System.out.println(browsername);
		driver.quit();
	
		
		
}
}