package C_Checkbox_Handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E_Dynamic_Checkbox {
	static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");

	driver=new ChromeDriver();
	driver.get("https://chercher.tech/practice/dynamic-table");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	List<WebElement>checkboxes=driver.findElements(By.xpath("//*[@id='table']//tr//td//input"));
	
	for(WebElement checkbox:checkboxes)
	checkbox.click();
	Thread.sleep(2000);
}
}
