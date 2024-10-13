package a3_Interface2;

public class ChildClass implements ParentClass {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 is abstract method present in parent class");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2 is abstract method present in parent class");
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
	System.out.println("m3 is abstract method present in parent class");
	}

	
		
	
	public static void main(String[] args) {
		ChildClass obj=new ChildClass();
		obj.m1();
		obj.m2();
		obj.m3();
	}

	
		
	
	
	
}
