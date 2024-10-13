package TestJava1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginPageTC extends BaseTest{
	
	@Test(priority=1)
	public void VerifyTitleOfLOginpage() {
		loginP.VerifypageTitle("OrangeHRM");
		Reporter.log(loginP.VerifypageTitle("OrangeHRM"), true);
	}
	
	@Test(priority=0)
	public void VerifyURLOfLOginpage() {
	loginP.VerifyCurrentUrl("https://opensource-demo.orangehrmlive.com/");
		Reporter.log(loginP.VerifyCurrentUrl("https://opensource-demo.orangehrmlive.com/"), true);
	}

	@Test(priority=2)
	public void VerifyValidCredential() {
	    loginP.LoginByCrediential("Admin","admin123");
	    Dashboard.varifylogout();
	}
	
	@Test(priority=3)
	public void VerifyInValidCredential() {
	    loginP.LoginByCrediential("aa","admin");
	    
	}
	@Test(priority=4)
	public void VerifyErrorMSG() {
		loginP.verifymsg("Invalid credentials");
		Reporter.log(loginP.verifymsg("Invalid credentials"),true);
		driver.navigate().refresh();
	}

}
