package a1selenium.webdriver.basictests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prc1JavaSeleniumProgram {
public static void main(String[]args)
{
	System.setProperty("webdriver.gecko.driver","C:/SOFTWARE/Selenium/Browser/geckodriver-v0.30.0-win64/geckodriver.exe");
	
WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	String Text=driver.findElement(By.xpath("//*[@class='_8eso']")).getText();
	System.out.println(Text);
	System.out.println(driver.getTitle());
	driver.findElement(By.name("email")).sendKeys("vinukharade007@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("90965027");
    //driver.findElement(By.name("login")).click();
   // driver.findElement(By.xpath("//*[@name='login']")).click();/// x- relative path 
    driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy'][@name='login']")).click();// multiple x path
    System.out.println(driver.getCurrentUrl());

    //driver.close();         // close the window which we are operating only.
  //  driver.quit();        // it closes all window we are operating.
    
 
}
}