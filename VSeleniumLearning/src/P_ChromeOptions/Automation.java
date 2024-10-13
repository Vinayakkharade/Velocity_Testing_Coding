package P_ChromeOptions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automation {
static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32 (3)/chromedriver.exe");
//
		driver=new ChromeDriver();
		
		driver.get("https://www.automationanywhere.com/");
		driver.manage().window().maximize();
		
		ChromeOptions option =new ChromeOptions();
		
		//option.addArguments("--DisablePopUPBlocking");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='link-wrap']//a[text()='Request Demo']")).click();
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		
		
		
		WebElement fstname=driver.findElement(By.xpath("//label[@id='LblFirstName']"));
		
		
		WebDriverWait w=new WebDriverWait(driver,10);
		w.until(ExpectedConditions.elementToBeClickable(fstname));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].value='Avinash Mishra';", fstname);
		

		
		//driver.findElement(By.xpath("//label[@id='LblLastName']")).sendKeys("kharade");
		
		//driver.findElement(By.xpath("//button[@class='btn']")).click();
		
	}

}
