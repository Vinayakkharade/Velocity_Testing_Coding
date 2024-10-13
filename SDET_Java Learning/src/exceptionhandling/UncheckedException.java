package exceptionhandling;

public class UncheckedException {
public static void main(String[] args) {
	
	///int a=10;
	
	///System.out.println(a/0);//// arithmetic exception
	
	////String s1=null;
	////System.out.println(s1.length());///nullPointer exception 
	
	//String s2="aargy";  /// number format exception
	//int i=Integer.parseInt(s2);
	//System.out.println(i);
	///
	
	int[] h=new int[5];
	h[10]=20;   /// arrayIndexOut bounds
	
}
}
//Exception Handling-It is used to handle runtime errors so that normal flow of application can be maintained.
//Exception-It is an abnormal event that terminates the program.
//1)checked exception:-exception are identified by java compiler then it is called checked exception
//2)Un-checked exception:-exception are not identified by java compiler then it is called Un-checked exception