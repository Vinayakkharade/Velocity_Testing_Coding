package A_testcase_execution_sequence;

import org.testng.Assert;
import org.testng.annotations.Test;

public class G_Difference_skipped_enable_false {
	@Test()
	public void testcase1() {
		System.out.println("testcase1");
		Assert.assertEquals(false, true);
	}

	@Test(priority=2,dependsOnMethods="testcase1")
	public void testcase2() {
		System.out.println("testcase2");
	}
}
