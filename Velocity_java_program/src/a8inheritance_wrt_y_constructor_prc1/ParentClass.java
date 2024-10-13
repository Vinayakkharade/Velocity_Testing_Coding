package a8inheritance_wrt_y_constructor_prc1;

public class ParentClass {

	public ParentClass(boolean b)
	{
		this(10);
		System.out.println("parent class present parametrised constructor 1");
		
	}
	
	public ParentClass(int a)
	{
		System.out.println("parent class present parametrised constructor 2");
	}
	
}
