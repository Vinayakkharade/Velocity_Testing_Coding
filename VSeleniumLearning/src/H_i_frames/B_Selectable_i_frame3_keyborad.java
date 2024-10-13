package H_i_frames;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class B_Selectable_i_frame3_keyborad {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/SOFTWARE/Velocity/Selenium/chromedriver/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();// invoke the chrome
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();

		WebElement iframe=driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(iframe);
		WebElement source=driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement target1=driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement target2=driver.findElement(By.xpath("//li[text()='Item 5']"));
		Actions act=new Actions(driver);

		act.keyDown(Keys.CONTROL).perform();
		act.click(source).click(target1).click(target2).keyUp(Keys.CONTROL).build().perform();

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",source);
	}
}
