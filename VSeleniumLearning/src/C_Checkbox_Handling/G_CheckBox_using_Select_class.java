package C_Checkbox_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class G_CheckBox_using_Select_class {
	static WebDriver driver;
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");
	
	driver=new ChromeDriver();
	driver.get("https://chercher.tech/practice/dynamic-table");
	
	WebElement checkbox1=driver.findElement(By.xpath("//*[text()='google.com']//parent::tr//input"));
	
	
	
}
}
