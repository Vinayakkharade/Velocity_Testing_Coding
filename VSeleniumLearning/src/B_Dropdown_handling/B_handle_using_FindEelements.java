package B_Dropdown_handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class B_handle_using_FindEelements {
	static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\SOFTWARE\\Selenium\\Browser\\geckodriver-v0.30.0-win64\\geckodriver.exe");

		driver=new FirefoxDriver();
		driver.get("https://mbasic.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#signup-button")).click();

		List<WebElement>dates=driver.findElements(By.cssSelector("#day option"));
		for(WebElement date:dates)
			if(date.getText().equals("29"))
				date.click();
		
		List<WebElement>months=driver.findElements(By.cssSelector("#month option"));
		for(WebElement month:months)
			if(month.getText().equalsIgnoreCase("Apr"))
                  month.click();
		
		List<WebElement>years=driver.findElements(By.xpath("//*[@id='year']//option"));
		for(WebElement year:years)
			if(year.getText().equalsIgnoreCase("1991"))
                  year.click();
		

	}
}
