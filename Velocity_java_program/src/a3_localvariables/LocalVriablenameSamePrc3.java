package a3_localvariables;

public class LocalVriablenameSamePrc3 {

	static int a=90;
	
	     public void m1()
		 {
		 	int a=45;
		 	System.out.println(a); 	
		 	System.out.println(LocalVriablenameSamePrc3.a); 
		 	
		}	
		 
	     public static void main(String[]args)
	     {
	    	 LocalVriablenameSamePrc3 obj =new LocalVriablenameSamePrc3();
	                   obj.m1();
	     
		 } 	
	
	   //1)To call static variable inside non static method we can use class name.variable name	
	
	
	
	
	
	
	
}
