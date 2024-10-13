package aa10SwichTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice1 {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:/SOFTWARE/Selenium/Browser/geckodriver-v0.30.0-win64/geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	
   driver.get("https://chercher.tech/practice/popups");
	
   driver.findElement(By.name("alert")).click();;
	   String alerttext=driver.switchTo().alert().getText();
	   System.out.println(alerttext);
	  driver.switchTo().alert().accept();
	  
	  driver.findElement(By.name("confirmation")).click();
	   String confirm=driver.switchTo().alert().getText();
	   System.out.println(confirm);
	  driver.switchTo().alert().dismiss();
	  
	  
	  driver.findElement(By.name("prompt")).click();
	 driver.switchTo().alert().sendKeys("promtbox");
	 //String prompt=driver.switchTo().alert().getText();
	// System.out.println(prompt);
	// driver.switchTo().alert().dismiss();
	  
	// driver.findElement(By.xpath("//*[@id=\"textbar\"]")).sendKeys("don");
	// driver.findElement(By.xpath("//*[@id=\"first\"]")).click();
	 
	 //Select f=new Select(driver.findElement(By.id("//*[@id=\"first\"]")));
	 
	// f.selectByValue("Google");
}
}
