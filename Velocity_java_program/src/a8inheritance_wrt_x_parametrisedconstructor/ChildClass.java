package a8inheritance_wrt_x_parametrisedconstructor;

public class ChildClass extends ParentClass {

	public ChildClass()
	{
		super(true);
		System.out.println("child class present parametrised constructor");
	}
	public static void main(String[] args) {
		ChildClass obj=new ChildClass();


	}



}
