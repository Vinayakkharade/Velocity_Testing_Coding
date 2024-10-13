package O_webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A2_Webtable2 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();// invoke the chrome
		driver.get("https://chercher.tech/practice/table");
		driver.manage().window().maximize();

		
		Thread.sleep(2000);
		List<WebElement>column =driver.findElements(By.xpath("//*[@id='webtable']//tbody//tr//th"));
		int colcount=column.size();
		System.out.println("column:"+colcount);
		Actions act =new Actions(driver);
		act.sendKeys(Keys.F5);

		List<WebElement>row =driver.findElements(By.xpath("//*[@id='webtable']//tbody//tr"));
		int rowcount=row.size()-1;
		System.out.println("row:"+rowcount);

		
		for(int i=2;i<=rowcount;i++) {
			for(int j=1;j<=colcount;j++) {
			WebElement cellvalue=driver.findElement(By.xpath("//*[@id='webtable']//tbody//tr["+i+"]//td["+j+"]"));
		if(cellvalue.getText().equalsIgnoreCase("Google"));
		
		System.out.println(j);
		System.exit(0);
			}
			
		}
	}
}