package TestJava;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginPageTestClass extends BaseTest {

	@Test(priority=0)
	public void VerifyTitle() {
		logpage.verifyPageTitle("OrangeHrm");
		Reporter.log("title is verifed",true);
	}
	
	@Test(priority=1)
	public void Verifyusername() {
		logpage.VerifyusernameField("Admin");
	}
	
	@Test(priority=2)
	public void VerifyPassword() {
		logpage.verifyPageTitle("admin123");
	}
}
