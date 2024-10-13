package popupwithdownload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class download1 {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.gecko.driver","C:/SOFTWARE/Selenium/Browser/geckodriver-v0.30.0-win64/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://chercher.tech/practice/hidden-division-popup");
	driver.findElement(By.xpath("/html/body/a")).click();
	
	Robot robot=new Robot();// Which simulate the keyboard action & mouse events.
	// robot it class present in jvm
	
	robot.keyPress(KeyEvent.VK_DOWN);//click the arrow down button of mouse.
	Thread.sleep(3000);
	robot.keyPress(KeyEvent.VK_TAB );//it press the tab we can move one element to another element.
	Thread.sleep(3000);
	robot.keyPress(KeyEvent.VK_TAB );
	Thread.sleep(3000);
	robot.keyPress(KeyEvent.VK_TAB );
	Thread.sleep(3000);
	robot.keyPress(KeyEvent.VK_ENTER);// click the enter button of keyboard.
	
}
}
