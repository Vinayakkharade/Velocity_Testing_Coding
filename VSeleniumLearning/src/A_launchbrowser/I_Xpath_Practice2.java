package A_launchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// XPATH child element: xpath of current node//child::a[0]
public class I_Xpath_Practice2 {
		static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://yandex.com/");
		
		driver.findElement(By.xpath("//*[@class='worldwide__list']//child::a[2]")).click();
		
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.xpath("//*[@class='_6lux']//child::input")).sendKeys("9096502732");
		driver.findElement(By.cssSelector("#passContainer input")).sendKeys("velocity22@");//get the value of  id we should use
		driver.findElement(By.xpath("//*[@class='_6ltg']/preceding::button")).click();// prescending 
		
		
		
}
}