package a3_Interface;

public class ChildClass2 extends ChildClass {

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("m3 is abstract method present in parent class");
	}
public static void main(String[] args) {
	ChildClass2 obj=new ChildClass2();
	obj.m1();
	obj.m2();
	obj.m3();
}
	
	
	
}
