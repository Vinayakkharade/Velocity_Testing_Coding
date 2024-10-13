package a1selenium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prc2CromeScript {
public static void main(String[]args)
{
System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Selenium/Browser/chromedriver_win32 (1)/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
   driver.manage().window().maximize();
   System.out.println(driver.getTitle());
	driver.findElement(By.id("email")).sendKeys("vinukharade007@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("90965027");
	driver.findElement(By.name("login")).click();
	
}

}
