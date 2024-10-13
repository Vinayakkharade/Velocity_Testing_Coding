package K_Waits;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class C_fluents_Waits {

		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");
			driver=new ChromeDriver();// invoke the chrome
			driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//*[@id='checkbox']")).click();
			
			FluentWait flu=new FluentWait<WebDriver>(driver);
			flu.withTimeout(Duration.ofSeconds(10));
			flu.pollingEvery(Duration.ofSeconds(2));
			flu.ignoring(NoSuchElementException.class);
			
			driver.findElement(By.cssSelector(".btn.btn-primary.btn-block")).click();

	}

}
