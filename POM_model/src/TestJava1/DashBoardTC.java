package TestJava1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DashBoardTC extends BaseTest{
	@Test(priority=5)
	public void VerifySwithToNewTab() {
		loginP.LoginByCrediential("Admin","admin123");
		Dashboard.varifySwithOfSecondTAB();
		Reporter.log("VerifySwithToNewTab success", true);

	}
}
