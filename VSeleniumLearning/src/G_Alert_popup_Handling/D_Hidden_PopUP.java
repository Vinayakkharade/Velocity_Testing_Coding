package G_Alert_popup_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class D_Hidden_PopUP {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\\\SOFTWARE\\\\Selenium\\\\Browser\\\\geckodriver-v0.30.0-win64\\\\geckodriver.exe");
		driver=new FirefoxDriver();// invoke the chrome
		driver.get("https://chercher.tech/practice/hidden-division-popup");
		driver.manage().window().maximize();


		driver.findElement(By.xpath("//*[text()='View Pop-up']")).click();
		
		driver.switchTo().alert().sendKeys("vinayak");
		driver.switchTo().alert().dismiss();
	}

}
