package K_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class B_Explicit_waits2 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();// invoke the chrome
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='checkbox']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		WebElement check=driver.findElement(By.xpath("//*[@id='ch']"));
		wait.until(ExpectedConditions.elementToBeSelected(check));
		driver.findElement(By.cssSelector(".btn.btn-primary.btn-block")).click();
		driver.navigate().back();
		
}
}