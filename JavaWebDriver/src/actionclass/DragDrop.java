package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:/SOFTWARE/Selenium/Browser/geckodriver-v0.30.0-win64/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	
	Actions act=new Actions(driver);
	WebElement so=driver.findElement(By.id("box1"));
	WebElement tr=driver.findElement(By.id("box106"));
	act.dragAndDrop(so,tr).build().perform();// it moves the element source to target
	
	WebElement sou=driver.findElement(By.id("box2"));
	WebElement trg=driver.findElement(By.id("box104"));
	act.dragAndDrop(sou,trg).build().perform();
	
	
	WebElement source=driver.findElement(By.id("box7"));
	WebElement target=driver.findElement(By.id("box103"));
	act.dragAndDrop(source,target).build().perform();
	
	      String title=driver.getTitle();
	      System.out.print(title);


	  	WebElement hold=driver.findElement(By.id("box4"));
	  	WebElement click=driver.findElement(By.id("box107"));
	  	
	  	act.clickAndHold(hold).release(click).build().perform();
	      //clickAndHold(hold)-- click the mouse left button & hold it for some time
	    //release(click)-- release the mouse button 
}
		
}
