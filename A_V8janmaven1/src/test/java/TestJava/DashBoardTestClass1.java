package TestJava;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DashBoardTestClass1 extends BaseTest11{

	@Test(priority=2)
	public void VerifyDashBoardTitle() {
		loginPage.loginMethod("Admin","admin123");
		String dashTitle=Dasboard.titleOfDashBoard();
		AssertJUnit.assertEquals(dashTitle, "Dashboard");
	}
	
	@Test(priority=3)
	public void Varifytabclick() {
		Dasboard.tabclick();
	}
	
	@Test(priority=4)
	public void VerifyLeaveTab() {
		String leaveTabTitle=Dasboard.LeaveTab();
		AssertJUnit.assertEquals(leaveTabTitle, "Assign Leave");
	}
}
