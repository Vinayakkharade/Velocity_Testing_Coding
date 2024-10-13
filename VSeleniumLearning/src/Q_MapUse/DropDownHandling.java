package Q_MapUse;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {
static WebDriver driver;

  static public void dropDownHandling() {
	WebElement dropdown=driver.findElement(By.xpath("//*[@class='information closable']//following-sibling::p//select"));
	
	Select sl=new Select(dropdown);
    
	List<WebElement>al=sl.getOptions();
	
for(WebElement single:al)
  
if(single.getText().equalsIgnoreCase("India"))
single.click();

	
	
	
	
}
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32 (3)/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
			driver.manage().window().maximize();
			dropDownHandling();
	}

}
