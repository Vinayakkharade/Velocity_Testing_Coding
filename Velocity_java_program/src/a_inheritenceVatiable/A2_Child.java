package a_inheritenceVatiable;

public class A2_Child extends A1_Parent {
	int a=1000;
	static int b=2000;

	public static void main(String[] args) {
	
		
		A2_Child obj1=new A2_Child();
		System.out.println(obj1.a);
		
		A1_Parent obj2=new A1_Parent();
		System.out.println(obj2.a);
		

	}

}
