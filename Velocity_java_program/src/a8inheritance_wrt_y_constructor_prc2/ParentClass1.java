package a8inheritance_wrt_y_constructor_prc2;

public class ParentClass1 {
	
	int a;
	int b;

	public ParentClass1(boolean b) //constructor 1
	{
		this(10,50);
		System.out.println("parent class present parametrised constructor");
		
	}
	
	public ParentClass1(int a,int b) //constructor 2
	{
		System.out.println("vaule of a="+a);
		System.out.println("vaule of b="+b);
	}
	
}
