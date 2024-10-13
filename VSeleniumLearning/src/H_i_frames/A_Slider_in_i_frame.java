package H_i_frames;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A_Slider_in_i_frame {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();// invoke the chrome
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();

		WebElement iframe=driver.findElement(By.tagName("iframe"));
		iframe.sendKeys(Keys.F5);
		
		
		driver.switchTo().frame(iframe);

		WebElement Source=driver.findElement(By.xpath("//*[@id='slider']//span"));
		Actions act=new Actions(driver);
		
		act.clickAndHold(Source).moveToElement(Source, 550, 0).release().build().perform();
        

	}

}
