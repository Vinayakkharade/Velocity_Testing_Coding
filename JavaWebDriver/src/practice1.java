import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class practice1 {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:/SOFTWARE/Selenium/Browser/geckodriver-v0.30.0-win64/geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	
   driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	
	Actions act=new Actions(driver);/// Action class which handles the mouse event(right click,click & hold for certain time)
	WebElement power=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
	act.contextClick(power).build().perform();/// right click the mouse button
	driver.findElement(By.xpath("/html/body/ul/li[3]")).click();
  String text= driver.switchTo().alert().getText();
  System.out.print(text);
    driver.switchTo().alert().accept();
}	
}
