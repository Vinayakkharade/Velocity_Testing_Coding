package a1_javamethods;

public class MerhodPrc1 {
 public void method1()
 {
	
	 System.out.println("method 1 is non static method");
 }
	
 public static void method2()
 {
	System.out.println("method 2 is static method");
 }
	
 public static void main(String[]args)
 {
	 MerhodPrc1 obj	=new MerhodPrc1();
	 obj.method1();
	 obj.method2();///static method will be accessed by creating object.but however such practice is not
	                 //recommended or allowed in java
	 
	 
	 
	 
 }
}
