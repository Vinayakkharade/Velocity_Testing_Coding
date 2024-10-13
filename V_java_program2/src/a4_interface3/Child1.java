package a4_interface3;

public class Child1 implements Parent1 , Parent2{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 is parent1 interface");
	}
public static void main(String[] args) {
	
	Child1 obj=new Child1();
	obj.m1();
	
}
	
	}



	
	

