package b_assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertionEx {
	@Test
  public void sostassertExample() {
	  
	  WebDriverManager.chromedriver().setup();
	  
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  SoftAssert softassert=new SoftAssert();// object is created for soft assert class
	  
	 String exceptedtiltle="Facebook – log in or sign up ass";
	 String actualtitle=driver.getTitle();
	 softassert.assertEquals(actualtitle,exceptedtiltle+  "wrong title");
	 
	 // login with correct username & wrong password
	 driver.findElement(By.name("email")).sendKeys("vinukharade007@gmail.com");
	 driver.findElement(By.name("pass")).sendKeys("9096");
	 driver.findElement(By.name("login")).click();
	 
	 String exceptedmsg="Log in as Vinu Kharade 12";
	 String actualmsg=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div[1]/span/div/div[1]/div[2]/span")).getText();
	 softassert.assertEquals(actualmsg, exceptedmsg+   "wrong msg");
	 
	 driver.quit();
	 softassert.assertAll();
	 
  }
}
// Hard assertion:which throws the exception immediately upon falling of assertion
//when we get hard assert then it will not execute the next line.
// it is used if we have only one assertion at the end of test case.

// Soft assertion:It will not throws the assertion immediately.. it may throws assertion at the end.

