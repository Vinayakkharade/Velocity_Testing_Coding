package A_launchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class D_Login_facebook {
	static WebDriver driver;
	public static void main(String[] args) {
   System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");
   // key-- which browser we want to use for autimate test scripts that brwser driver is browser driver mention as key)
   // value-- path of browser driver
   // (if the key or value is empty--- Null pointer exception)
   //(if the key is empty-- illegual argument exception)
   driver=new ChromeDriver();
   driver.get("https://www.facebook.com/");
   driver.manage().window().maximize();
   driver.findElement(By.id("email")).sendKeys("9096502732");
   driver.findElement(By.id("pass")).sendKeys("90965027");
   
   //driver.findElement(By.name("login")).click();
   driver.findElement(By.xpath("//*[@name='login']")).click();
  
   
	}

}
