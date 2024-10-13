package F_Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class E_Hold_Click {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/drag-drop.html");
		driver.manage().window().maximize();
	
		WebElement source1=driver.findElement(By.xpath("//*[@id='box2'][@class='box red']"));
		WebElement target1=driver.findElement(By.xpath("//*[@id='destination']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(source1,target1).build().perform();
		//act.clickAndHold(source1).perform();
		//Thread.sleep(2000);
		
		//act.moveToElement(target1).release().build().perform();
}
}