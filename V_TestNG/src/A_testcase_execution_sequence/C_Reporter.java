package A_testcase_execution_sequence;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class C_Reporter {

	@Test(priority=1)
	public void testcase1() {
		Reporter.log("login is succesfully",true);
	
	}

	@Test(priority=2)
	public void testcase2() {
		Reporter.log("logout is succesfully",false);
	}
}
