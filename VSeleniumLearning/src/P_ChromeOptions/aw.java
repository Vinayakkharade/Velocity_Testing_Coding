package P_ChromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class aw {
  static WebDriver Null;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.facebook.com/login/");
        String titlePage=driver.getTitle();
        if(titlePage.equals("Log in to Facebook"))
        	System.out.println("title is OK");
        
        else
        	System.out.println("title is NotOK");
	}

	
}
