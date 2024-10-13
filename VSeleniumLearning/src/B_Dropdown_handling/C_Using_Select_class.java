package B_Dropdown_handling;
////[@class='datepick-month-header']//select
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class C_Using_Select_class {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","C:\\SOFTWARE\\Selenium\\Browser\\geckodriver-v0.30.0-win64\\geckodriver.exe");

		driver=new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id='datepicker2']")).click();
		
		WebElement month=driver.findElement(By.xpath("//*[@class='datepick-month-header']//select[1]"));
		Select month1=new Select(month);
		month1.selectByIndex(5);
		
		WebElement year1=driver.findElement(By.xpath("//*[@class='datepick-month-header']//select[2]"));
		Select y1=new Select(year1);
		y1.selectByVisibleText("2012");
		
		WebElement year2=driver.findElement(By.xpath("//*[@class='datepick-month-header']//select[2]"));
		Select y2=new Select(year2);
		y2.selectByVisibleText("2002");
		
		WebElement year3=driver.findElement(By.xpath("//*[@class='datepick-month-header']//select[2]"));
		Select y3=new Select(year3);
		y3.selectByVisibleText("1995");
		
				
		driver.findElement(By.linkText("3")).click();
		
	
}
}