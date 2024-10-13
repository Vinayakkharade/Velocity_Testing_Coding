import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ss {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.gecko.driver","C:/SOFTWARE/Selenium/Browser/geckodriver-v0.30.0-win64/geckodriver.exe");
		
	WebDriver driver=new FirefoxDriver();
	driver.get("https://chercher.tech/practice/dropdowns");
	
	driver.findElement(By.xpath("//*[@id=\"animals\"]")).click();

	Select f=new Select(driver.findElement(By.xpath("//*[@id=\"animals\"]")));
	
	f.selectByValue("big baby cat");
	driver.findElement(By.id("checkme")).click();

}
}