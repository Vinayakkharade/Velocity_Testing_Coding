package A_testcase_execution_sequence;

import org.testng.annotations.Test;

public class D_Enabledmethod {

	@Test(enabled=true)
	public void testcase1() {
		System.out.println("testcase1");
	}

	@Test(enabled=false)
	public void testcase2() {
		System.out.println("testcase2");
	}
}// if we want to remove the particular tc from execution process-- enabled-false
