package a1selenium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prc5TestCase1 {
public static void main(String[]args)
{
	System.setProperty("webdriver.gecko.driver","C:/SOFTWARE/Selenium/Browser/geckodriver-v0.30.0-win64/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.amazon.in/");
	String title= driver.getTitle();
	System.out.println(title);
	
	WebElement twotabsearchtextbox= driver.findElement(By.id("twotabsearchtextbox"));
	
	if(twotabsearchtextbox.isDisplayed()&&(twotabsearchtextbox.isEnabled()))
		twotabsearchtextbox.sendKeys("LED TV");
	   System.out.println("search box enabled");
	
	driver.findElement(By.id("nav-search-submit-button")).click();
	
}
}
