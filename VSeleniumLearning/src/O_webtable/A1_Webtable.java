package O_webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1_Webtable {

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

		List<WebElement>row =driver.findElements(By.xpath("//*[@id='webtable']//tbody//tr"));
		int rowcount=row.size()-1;
		System.out.println("row:"+rowcount);

		// particular row data
		List<WebElement>t1=driver.findElements(By.xpath("//*[text()='Search Engine']//parent::tr"));
		for(WebElement data:t1)
		{
			String information=data.getText();
			//System.out.print(information+"  ");
		}
		int specificCell=0;
		for(int i=2;i<=rowcount;i++) {
			//int specificCell=0;
			for(int j=1;j<=colcount;j++) {
			WebElement cellvalue=driver.findElement(By.xpath("C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32 (3)/chromedriver.exe"));
			if(cellvalue.getText().equalsIgnoreCase("Facebook"))
				System.out.println("specific row:"+(i-1));
			specificCell++;
			}
			System.out.println(specificCell);
		
		
		}
	}
}
