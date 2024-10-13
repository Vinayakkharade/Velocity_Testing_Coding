package K_Waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_Implicit_waits {

		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");
			driver=new ChromeDriver();// invoke the chrome
			driver.get("https://chercher.tech/practice/implicit-wait-example");
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			int i=1;
			while(i>0) {
			driver.findElement(By.xpath("(//*[@id='q']//input)["+i+"]")).click();
			i++;
			}
	}

}
