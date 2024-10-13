package A_launchbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C_BrowserCommands {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","C:\\SOFTWARE\\Selenium\\Browser\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	
		driver=new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		
		String url=driver.getCurrentUrl();// get url of current page
	     System.out.println(url);
	     
	     String title=driver.getTitle();// get the title of page
	     System.out.println(title);
		
		if(url.equals("https://www.youtube.com/"))
			System.out.println("test is passed-- url ok");
		
		if(title.equals("YouTube"))
			System.out.println("test is passed-- title ok");
		
		//driver.quit();
	}
	
	
	
}
