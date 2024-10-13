package F_Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class G_Slider {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://jqueryui.com/slider/");
	driver.manage().window().maximize();
	
	WebElement frm=driver.findElement(By.className("demo-frame"));
	driver.switchTo().frame(frm);
	WebElement source=driver.findElement(By.cssSelector(".ui-slider-handle.ui-corner-all.ui-state-default"));
	WebElement trg=driver.findElement(By.xpath("//*[@id='slider']"));
	Actions act=new Actions(driver);
	
	act.clickAndHold(source).perform();
	Thread.sleep(2000);
	act.moveToElement(trg, 0, 20).build().perform();
	
	


	}

}
