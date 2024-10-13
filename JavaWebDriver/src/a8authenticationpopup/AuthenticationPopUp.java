package a8authenticationpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {

  public static void main(String[] args) {
  System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Selenium/Browser/chromedriver_win32 (1)/chromedriver.exe");
  WebDriver driver=new ChromeDriver();
		
  driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");
		
 String text= driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText();
 System.out.println(text);
	}

}// athentication popup
//syntax--- driver.get("https://username:password@url);