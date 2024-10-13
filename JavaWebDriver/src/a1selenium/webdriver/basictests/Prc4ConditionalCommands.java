package a1selenium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prc4ConditionalCommands {
	
		public static void main(String[]args)
		{
	    System.setProperty("webdriver.gecko.driver","C:/SOFTWARE/Selenium/Browser/geckodriver-v0.30.0-win64/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
		   driver.get("https://www.facebook.com/");
		   WebElement email=driver.findElement(By.name("email"));
		  WebElement pass=driver.findElement(By.name("pass"));
	if(email.isDisplayed() && email.isEnabled())
			email.sendKeys("vinukharade007@gmail.com");

	if(pass.isDisplayed()&& pass.isEnabled())
	pass.sendKeys("90965027");
	driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	
	System.out.println(driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/label")).isSelected());

	driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/label")).click();
		}
}
