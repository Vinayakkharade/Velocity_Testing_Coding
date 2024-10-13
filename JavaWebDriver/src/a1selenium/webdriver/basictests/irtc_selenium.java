package a1selenium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class irtc_selenium {
	
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new FirefoxDriver();
	System.setProperty("webdriver.gecko.driver", "C:/SOFTWARE/Selenium/Browser/geckodriver-v0.30.0-win64/geckodriver.exe");
	
	driver.get("https://www.irctc.co.in/nget/train-search");
	
	WebDriverWait w=new WebDriverWait(driver,10);
	
	WebElement searchbox=driver.findElement(By.xpath("//*[@id='origin']//input[@role='searchbox']"));
	
	w.wait(20000);
	
	
	searchbox.sendKeys("ban");
	
	////span[text()=' BABINA - BAB ']
	
	WebElement drpdownvalue=driver.findElement(By.xpath("//span[text()='"+ BABINA - BAB +"']"));
	
	//JavaScriptExecutor js=(JavaScriptExecutor)driver;
	
	drpdownvalue.click();
	
}

}
