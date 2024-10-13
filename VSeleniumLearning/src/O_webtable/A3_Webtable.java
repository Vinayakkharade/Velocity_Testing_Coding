package O_webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A3_Webtable {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();// invoke the chrome
		driver.get("https://chercher.tech/practice/table");
		driver.manage().window().maximize();

		List<WebElement>rows=driver.findElements(By.xpath("//*[@id='webtable']//tbody//tr"));
		List<WebElement>cells=driver.findElements(By.xpath("//*[@id='webtable']//tbody//tr//td"));
		int cellValue=cells.size();
		int rowsize=rows.size();
		System.out.println(cellValue);
		
	
		
		for(int i=2;i<=rowsize;i++) {
			for(int j=1;j<=cellValue;j++) {
			WebElement cellTtext=driver.findElement(By.xpath("//*[@id='webtable']//tbody//tr["+i+"]//td["+j+"]"));
			String text=cellTtext.getText();
			//System.exit(0);
			System.out.println(text);
			
			System.out.println(j);
		
		
		}
		}
}
}