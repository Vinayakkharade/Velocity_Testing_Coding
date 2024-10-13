package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizeable {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:/SOFTWARE/Selenium/Browser/geckodriver-v0.30.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Resizable.html");
		
		Actions act=new Actions(driver);
	   // WebElement size=driver.findElement(By.xpath("//*[@id=\"resizable\"]"));
		WebElement strench=driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div/div[3]"));
		
        
	          act.dragAndDropBy(strench, 100, 100).build().perform();// sretching the element
		// 
	}
	
}
