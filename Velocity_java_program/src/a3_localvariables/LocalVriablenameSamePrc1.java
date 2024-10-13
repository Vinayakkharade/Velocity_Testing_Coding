package a3_localvariables;

public class LocalVriablenameSamePrc1 {
	
	 int a=50;
	 
	static void m1()
	 {
	 	int a=100;
	 	System.out.println(a);
	 	
	 	
	 	
	 }
	 public static void main(String[]args)
	 {
		 LocalVriablenameSamePrc1 obj=new LocalVriablenameSamePrc1();
		 m1();
		 System.out.println(obj.a);
		 
}
}///1)To call non static variable inside static method we can use objname.variable name