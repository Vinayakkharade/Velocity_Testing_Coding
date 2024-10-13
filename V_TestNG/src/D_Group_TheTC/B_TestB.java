package D_Group_TheTC;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class B_TestB  {

	@Test(priority=3,groups="smoke")
	public void NewTabOperation() {

		Reporter.log("NewTabop smoke Success",true);
	}
	
	@Test(priority=4,groups="regression")
	public void NewTabop2() {
	
		Reporter.log("NewTabop regression Success",true);
	}
	
	
	
	
	
	
	
	
	
}
