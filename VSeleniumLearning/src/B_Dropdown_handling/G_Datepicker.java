package B_Dropdown_handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class G_Datepicker {
	static WebDriver driver;
	public void yearSelectionForPreviousPast10Years(String year) {
		List<WebElement> yearSelectionForPreviousPast10Years = driver.findElements(By.xpath("//select[@title='Change the year']//option"));
		yearSelectionForPreviousPast10Years.get(0).click();
		yearSelectionForCurrentPast10Years(year);
		
	}
	public void yearSelectionForCurrentPast10Years(String year){
		WebElement yearSelectionForCurrentPast10Years = driver.findElement(By.xpath("//select[@title='Change the year']"));
		Select past10y = new Select(yearSelectionForCurrentPast10Years);
		past10y.selectByVisibleText(year);
	}
	
	
	public void month(String montharg) {
		WebElement month = driver.findElement(By.xpath("//select[@title='Change the month']"));
	    Select m = new Select(month);
	    m.selectByVisibleText(montharg);
	}
	public void date(String dt) {
		List<WebElement> allDate = driver.findElements(By.xpath("//table//tr//td//a"));
		for(WebElement date:allDate) {
			if(date.getText().equals(dt))
					date.click();
			
		}
	}
	public void clickOnDatePicker2() {
		driver.findElement(By.xpath("//input[@id=\"datepicker2\"]")).click();
		
	}
	public void selectFromDatePicker2(String year,String month,String date) throws InterruptedException {
		clickOnDatePicker2();
		Thread.sleep(1000);
		yearSelectionForPreviousPast10Years(year);
		month(month);
		date(date);
		
		
	}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		G_Datepicker  obj = new G_Datepicker ();
		obj.selectFromDatePicker2("1993","June","24");
	}
}
