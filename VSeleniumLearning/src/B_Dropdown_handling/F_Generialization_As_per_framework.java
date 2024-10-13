package B_Dropdown_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F_Generialization_As_per_framework {
	static WebDriver driver;

	public void datapicker(String MonthY,String Date) throws InterruptedException {
		driver.findElement(By.id("datepicker1")).click();
		Thread.sleep(2000);
		int a=0;
		while(a==0) {
			String monthYear=driver.findElement(By.className("ui-datepicker-title")).getText();
			
			if(!monthYear.equals(""+MonthY+""))
				driver.findElement(By.cssSelector(".ui-datepicker-prev.ui-corner-all")).click();
			else
				break;
		}
		
		driver.findElement(By.linkText(""+Date+"")).click();
	}

	public static void main(String[] args) throws InterruptedException {
// system- it is class present java.lang package. java liabraties are intergrated with selenium jar files.
		// setproperty is a static method system class.
		System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();// invoke the chrome
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		F_Generialization_As_per_framework dataSelect=new F_Generialization_As_per_framework();
		dataSelect.datapicker("April 1991","29");

	}
}
//Tagname-All the attribute are represented by one tagline.. & name of that taglineis called tagname.
