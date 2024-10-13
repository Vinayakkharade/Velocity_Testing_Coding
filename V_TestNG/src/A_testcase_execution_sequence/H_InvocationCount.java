package A_testcase_execution_sequence;

import org.testng.annotations.Test;

public class H_InvocationCount {
	@Test(priority=1,invocationCount=5)
	public void testcase1() {
		System.out.println("testcase1");
	}
	@Test(priority=2,invocationCount=3)
	public void testcase2() {
		System.out.println("testcase2");
	}

}
