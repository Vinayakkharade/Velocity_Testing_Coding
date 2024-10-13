package H_i_frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class B_Selectable_i_frame {
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");
			driver=new ChromeDriver();// invoke the chrome
			driver.get("https://jqueryui.com/selectable/");
			driver.manage().window().maximize();

			WebElement iframe=driver.findElement(By.tagName("iframe"));
			driver.switchTo().frame(iframe);
			WebElement Source=driver.findElement(By.xpath("//li[text()='Item 1']"));
			WebElement target=driver.findElement(By.xpath("//li[text()='Item 6']"));
			Actions act=new Actions(driver);
			
			act.clickAndHold(Source).perform();
			act.moveToElement(target).release().build().perform();
	}

}
