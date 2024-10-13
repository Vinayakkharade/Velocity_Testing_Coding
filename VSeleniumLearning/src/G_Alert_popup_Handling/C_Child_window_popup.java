package G_Alert_popup_Handling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_Child_window_popup {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();// invoke the chrome
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		String primary=driver.getWindowHandle();
		
		driver.findElement(By.cssSelector("#windowButton")).click();
		Set<String>windows=driver.getWindowHandles();
		for(String wind:windows)
			if(!primary.equals(wind))
				driver.switchTo().window(wind);
		String text=driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
	    driver.close();

	}

}
