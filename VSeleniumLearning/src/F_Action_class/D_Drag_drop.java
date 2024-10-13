package F_Action_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D_Drag_drop {
	
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://demo.guru99.com/test/drag_drop.html");
			driver.manage().window().maximize();

			Thread.sleep(2000);
			List<WebElement>el=driver.findElements(By.xpath("//a[@class='button button-orange']"));
			WebElement source=el.get(3);
			
			WebElement target=driver.findElement(By.xpath("//*[@class='field13 ui-droppable ui-sortable'][@id='amt8']//li"));
			Actions act=new Actions(driver);
			act.dragAndDrop(source, target).perform();
			
			String text=driver.findElement(By.xpath("//div[@id='t8']")).getText();
			System.out.print(text);
			
			String color=driver.findElement(By.xpath("//*[text()=' SALES ']")).getCssValue("backgtound-color");
			System.out.print(color);
	}

}
