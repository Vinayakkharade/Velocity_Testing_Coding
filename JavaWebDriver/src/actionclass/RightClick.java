package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RightClick {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:/SOFTWARE/Selenium/Browser/geckodriver-v0.30.0-win64/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	
   Actions act=new Actions(driver); 
   WebElement button=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
   act.contextClick(button).build().perform();/// it click the right button of mouse
   driver.findElement(By.xpath("/html/body/ul/li[3]")).click();
   String text=driver.switchTo().alert().getText();
   System.out.println(text);
   driver.switchTo().alert().accept();
   
  WebElement x=driver.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li[1]/a"));
  

  
  
}
}
