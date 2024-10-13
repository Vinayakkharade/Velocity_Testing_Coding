package a3_multipleinterface;

public class Child implements parent1,Parent2{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 is abstract method present in parent1 interface");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2 is abstract method present in parent1 interface");
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("m3 is abstract method present in parent2 interface");
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("m4 is abstract method present in parent2 interface");
	}

	public static void main(String[] args) {
		Child obj =new Child();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
	}
	
}
