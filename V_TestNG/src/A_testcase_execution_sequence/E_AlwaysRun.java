package A_testcase_execution_sequence;

import org.testng.Assert;
import org.testng.annotations.Test;

public class E_AlwaysRun {

	@Test(enabled=true)
	public void testcase1() {
		System.out.println("testcase1_hello");
		Assert.assertEquals(false, true);
	}

	@Test(dependsOnMethods="testcase1", alwaysRun=true)
	public void testcase2() {
		System.out.println("testcase2");
	}
}
