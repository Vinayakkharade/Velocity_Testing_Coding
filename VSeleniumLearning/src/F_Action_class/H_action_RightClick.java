package F_Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class H_action_RightClick {

	static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32 (3)/chromedriver.exe");

			driver=new ChromeDriver();
			
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			driver.manage().window().maximize();
			
			Actions act=new Actions(driver);
			
			WebElement rtclick=driver.findElement(By.xpath("//*[text()='right click me']"));
			
			act.contextClick(rtclick).perform();
			
			driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']")).click();
			
			driver.switchTo().alert().accept();
			
			//Launching Sample site
			driver.get("https://artoftesting.com/samplesiteforselenium");
			
			//Right click in the TextBox
			Actions action = new Actions(driver);
			WebElement searchBox = driver.findElement(By.id("fname"));
			action.contextClick(searchBox).perform();
			
			//Thread.sleep just for user to notice the event
			Thread.sleep(3000);
			
			

	}

}
