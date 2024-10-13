package a9accessmodifierfinal;

public class ClassA {

	final int a=100;
	
	public static void main(String[] args) {
		ClassA obj=new ClassA();
		System.out.println(obj.a);
		
		
	
		ClassA obj1=new ClassA();
		obj1.a=200;
		System.out.println(obj1.a);
		
	}
	
}
