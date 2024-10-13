package a3_abstraction;

public class Child extends Parent  {

	@Override
	void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 is parent class method");
	}

	public static void main(String[] args) {
		Child obj=new Child();
		obj.m1();
		obj.m2();
		m3();
	}
	
	
}
