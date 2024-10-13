package A_testcase_execution_sequence;

import org.testng.annotations.Test;

public class B_Priority {

	@Test(priority=1)
	public void testcase1() {
		System.out.println("testcase1");
	}

	@Test(priority=3)
	public void testcase3() {
		System.out.println("testcase3");
	}
	
	@Test
	public void testcase2() {
		System.out.println("testcase2");
	}
	@Test
	public void testcase4() {
		System.out.println("testcase4");
	}
	
	
	
	
	
}
