package a8inheritance_wrt_y_constructor_prc2;

public class ChildClass1 extends ParentClass1{

   public ChildClass1(int a,int b)         /// default constructor
   {
	   super(true);
	   System.out.println("child class present default constructor");
	   System.out.println("child class A="+a);
	   System.out.println("child class B="+b);
	   
   }
   public static void main(String[] args) {
	
	   ChildClass1 obj=new ChildClass1(100,300);
	   
}
}


