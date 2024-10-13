package A_testcase_execution_sequence;

import org.testng.Assert;
import org.testng.annotations.Test;

public class F_Diff_between_enabled1_alwaysRun1 {

	@Test
	public void testcase1() {
		System.out.println("testcase1");
		Assert.assertEquals(false, true);
	}

	@Test(priority=2,dependsOnMethods="testcase1", enabled=true,alwaysRun=true)
	public void testcase2() {
		System.out.println("testcase2");
	}
}
