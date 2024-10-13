package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseoverAction {
public static void main(String[] args) {
//if key or value is null then we get the exception null pointer exception.
	//if key is empty the we get illegal argument exception.
System.setProperty("webdriver.gecko.driver","C:/SOFTWARE/Selenium/Browser/geckodriver-v0.30.0-win64/geckodriver.exe");
WebDriver driver=new FirefoxDriver();// it invoke firefoxdriver
// child object can be reffered by parent reference.)
//firefoxdriver object can referred by webdriver reference)

  driver.get("http://demo.automationtesting.in/Datepicker.html");
  // driver.get(string url)// which website we want to open that website url is passed in get method.
  
     Actions act=new Actions(driver);// Actions class which handles all mouse evet.
     WebElement sw=driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[4]/a"));
       WebElement sx=driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[4]/ul/li[1]/a"));
       WebElement sy=driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[4]/ul/li[2]/a"));
  
  //act.moveToElement(sw).build().perform();
  // move to element-- moving the cursor from one element to another element
  //build().perform()-- it is used completeing operation
  
   //act.moveToElement(sx).build().perform();
   //act.moveToElement(sy).click().build().perform();
   act.moveToElement(sw).moveToElement(sx).moveToElement(sy).click().build().perform();	
   
}
}