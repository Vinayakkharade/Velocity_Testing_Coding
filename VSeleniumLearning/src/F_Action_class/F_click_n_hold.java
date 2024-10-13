package F_Action_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class F_click_n_hold {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	driver.manage().window().maximize();
	
	Actions act=new Actions(driver);
	WebElement source1=driver.findElement(By.xpath("//*[text()='Washington'][@id='box3']"));
	WebElement target1=driver.findElement(By.xpath("//*[text()='South Korea'][@id='box105']"));
	act.dragAndDrop(source1, target1).build().perform();
	
	WebElement source2=driver.findElement(By.xpath("//*[text()='Rome'][@id='box6']"));
	WebElement target2=driver.findElement(By.xpath("//*[text()='Italy'][@id='box106']"));
	act.clickAndHold(source2).perform();
	Thread.sleep(2000);
	act.moveToElement(target2).release().build().perform();
}
}