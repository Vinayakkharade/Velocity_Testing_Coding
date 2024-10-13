package aa10SwichTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertOk {
public static void main(String[] args) {
	{
 System.setProperty("webdriver.gecko.driver","C:/SOFTWARE/Selenium/Browser/geckodriver-v0.30.0-win64/geckodriver.exe");
		
 WebDriver driver=new FirefoxDriver();
 driver.get("http://demo.automationtesting.in/Alerts.html");
 driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
 driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/button")).click();
 
       System.out.println(driver.switchTo().alert().getText());
   driver.switchTo().alert().accept();
   //here we are switching from web page to alertbox
   //accept()--it is a method which click on ok button & close the alert box.
	}
}
	
	
}
