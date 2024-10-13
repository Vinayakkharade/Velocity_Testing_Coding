package a2_Globalvariables;

public class A2GlobalNonStaticVariablePrc2 {
    int a=50;
   
   static void m1()
   {
	   A2GlobalNonStaticVariablePrc2 obj =new A2GlobalNonStaticVariablePrc2();
	   System.out.println(obj.a);
   }
   void m2()
   {
   System.out.println(a);
   }
   public static void main(String[]args)
   {
	   m1();
	   
	   A2GlobalNonStaticVariablePrc2 obj1=new A2GlobalNonStaticVariablePrc2();
	   obj1.a=60;
	   obj1.m2();
	  
	   A2GlobalNonStaticVariablePrc2 obj2=new A2GlobalNonStaticVariablePrc2();
	   obj2.a=70;
	   obj2.m2();
	   m1();
	   obj2.m2();
	   
   }
   
}
