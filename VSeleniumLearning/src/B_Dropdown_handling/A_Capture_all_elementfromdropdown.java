package B_Dropdown_handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class A_Capture_all_elementfromdropdown {
	
	static WebDriver driver;
public static void main(String[] args) {
	
	System.setProperty("webdriver.gecko.driver","C:\\SOFTWARE\\Selenium\\Browser\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	
	driver=new FirefoxDriver();
	driver.get("https://mbasic.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("#signup-button")).click();
	
	List<WebElement>days=driver.findElements(By.xpath("//*[@id='day']"));
	
	for(WebElement day:days)
	System.out.println(day.getText());
	
	
	
}
}
