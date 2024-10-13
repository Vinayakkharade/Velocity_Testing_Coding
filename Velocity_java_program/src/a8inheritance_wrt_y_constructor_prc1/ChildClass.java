package a8inheritance_wrt_y_constructor_prc1;

public class ChildClass extends ParentClass{
   public ChildClass()
   {
	   super(true);
	   System.out.println("child class present default constructor");
   }
   public static void main(String[] args) {
	
	   ChildClass obj=new ChildClass();
	   
}
}


