package D_Group_TheTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A_TestA {

	@Test(priority=1,groups="regression")
		public void LoginVerify() {
		
		
			Reporter.log("login is regression successfully",true);
		}
	
	@Test(priority=2,groups="smoke")
	public void NewTabOpen() {
		
		Reporter.log("new tab open smoke successfully ",true);
}
}