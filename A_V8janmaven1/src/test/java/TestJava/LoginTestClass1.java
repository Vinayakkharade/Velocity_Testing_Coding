package TestJava;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Test;

import MainJava.BaseClass11;

public class LoginTestClass1 extends BaseTest11{
	
	@Test(priority=0)
	public void verifyUrlOfPage() {
		String url = loginPage.pageUrl();
		AssertJUnit.assertEquals(url, "https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(priority=1)
	public void verifyTitleOfPage() {
		String title = loginPage.pageTitle();
		AssertJUnit.assertEquals(title, "OrangeHRM");
	}
	
	
	
}
