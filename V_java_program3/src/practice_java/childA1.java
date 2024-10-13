package practice_java;

public class childA1 extends parentA1{
	
	public void m1() {
	
		System.out.println("child M1");
	}
	
	public static void main(String[] args) {
		
		childA1 obj=new childA1();
		
		obj.m1();
	}

	
}
