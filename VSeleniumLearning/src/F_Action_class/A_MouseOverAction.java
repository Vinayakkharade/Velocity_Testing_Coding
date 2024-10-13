package F_Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A_MouseOverAction {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();// invoke the chrome
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();

		WebElement mouseOver=driver.findElement(By.id("sub-menu"));
		Actions act=new Actions(driver);
		act.moveToElement(mouseOver).perform();
	
		Thread.sleep(1000);
		WebElement clickAction=driver.findElement(By.id("link3"));
		act.click(clickAction).perform();
		
		Thread.sleep(3000);
		driver.navigate().back();
		WebElement dbclick=driver.findElement(By.xpath("//input[@id='double-click']"));
		act.doubleClick(dbclick).perform();
	}
// mouseover & doubleclick
}
