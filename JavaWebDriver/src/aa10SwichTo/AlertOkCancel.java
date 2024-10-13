package aa10SwichTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertOkCancel {

	public static void main(String[] args) {
		
 System.setProperty("webdriver.gecko.driver","C:/SOFTWARE/Selenium/Browser/geckodriver-v0.30.0-win64/geckodriver.exe");
			
 WebDriver driver=new FirefoxDriver();
 driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button")).click();
		
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		
		String expectedtext="You pressed Ok";
		driver.switchTo().alert().accept();/// click on ok button 
		String actulText=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		if( expectedtext.equals(actulText))
			System.out.println("OK TEST IS PASSED");
		else
			System.out.println("OK TEST IS fail");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button")).click();
		
		String expectedtext1="You Pressed Cancel";
		driver.switchTo().alert().dismiss();// it click on cancel button
		String actulText1=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		if( expectedtext1.equals(actulText1))
			System.out.println("cancel TEST IS PASSED");
		else
			System.out.println("cancel TEST IS fail");
	}
	
	
}
