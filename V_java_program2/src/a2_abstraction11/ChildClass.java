package a2_abstraction11;

public class ChildClass extends Parent1 {

	@Override
	void m4() {
		// TODO Auto-generated method stub
		System.out.println("m4 parent class abstract implementted method");
	}
	
	public static void main(String[] args) {
		 ChildClass obj=new  ChildClass();
		 obj.m1();
		 obj.m3(false);
		 obj.m4();
		 m2();
	}
}
