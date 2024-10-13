package a9accessmodifierpublic;

public class ClassB  {

	public static void m2()
	{
		System.out.println("m2 is static method present in classB");
		
	}
	public static void main(String[] args) {
		m2();
		ClassA.m1();
	}
}
