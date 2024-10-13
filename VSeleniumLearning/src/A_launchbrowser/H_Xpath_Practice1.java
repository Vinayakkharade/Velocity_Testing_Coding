package A_launchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// find the parent of current node
// syntax-- xpath of current node//parent::tagname
// xpath of the parent node //*[@attribute name='value']//parent::tagname
public class H_Xpath_Practice1 {
	static WebDriver driver;
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.get("https://yandex.com/");
	
	driver.findElement(By.xpath("//*[@id='text']//parent::span")).sendKeys("cat");
}
}