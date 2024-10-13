package F_Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class B_Right_and_Double_Click {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		WebElement rightClick=driver.findElement(By.xpath("//*[text()='right click me']"));
		Actions act=new Actions(driver);
		act.contextClick(rightClick).perform();
		Thread.sleep(2000);
		WebElement paste=driver.findElement(By.xpath("//*[@class='context-menu-item context-menu-icon context-menu-icon-paste']"));
		act.click(paste).perform();
		
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		WebElement dbclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(dbclick).perform();
		
		String text=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.print(text);
	}

}
