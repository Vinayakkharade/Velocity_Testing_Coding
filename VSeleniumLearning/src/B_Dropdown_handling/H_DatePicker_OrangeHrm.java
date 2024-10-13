package B_Dropdown_handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class H_DatePicker_OrangeHrm {
	static WebDriver driver;
	public void LoginOrangngeHrm() throws InterruptedException {
		driver.findElement(By.cssSelector("#divUsername input")).sendKeys("Admin");
		driver.findElement(By.cssSelector("#divPassword input")).sendKeys("admin123");
		driver.findElement(By.cssSelector("#divLoginButton input")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Leave List')][@class='quickLinkText']")).click();
		driver.findElement(By.xpath("//*[@id='calFromDate']")).click();
	}
	public void Y1(String year) {
		WebElement y1=driver.findElement(By.xpath("//*[@class='ui-datepicker-year']"));
		Select sc1=new Select(y1);
		sc1.selectByVisibleText(year);
	}
	public void M1(String month) {
		WebElement m1=driver.findElement(By.xpath("//*[@class='ui-datepicker-month']"));
		Select sc2=new Select(m1);
		sc2.selectByVisibleText(month);
	}
	public void D1(String date) {
		List<WebElement>d1=driver.findElements(By.xpath("//*[@class='ui-datepicker-calendar']//tbody//tr//td"));
	for( WebElement d:d1)
		if(d.getText().equals(date))
			d.click();
	}
	public void picker(String year,String month,String date) throws InterruptedException {
		Y1(year);
		Thread.sleep(2000);
		M1(month);
		Thread.sleep(2000);
		D1(date);
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");
		// system is class present in java.lang package.it is final class so we can not inherited that class accessed by using composition.
		//setproperty is static method which configure to broser driver.
		// all the java liibraries which are configure with selenium jar files.
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		H_DatePicker_OrangeHrm login=new H_DatePicker_OrangeHrm();
		login.LoginOrangngeHrm();
		Thread.sleep(2000);

		H_DatePicker_OrangeHrm pick=new H_DatePicker_OrangeHrm();
        pick.picker("1995","Jun","26");
	}
}
