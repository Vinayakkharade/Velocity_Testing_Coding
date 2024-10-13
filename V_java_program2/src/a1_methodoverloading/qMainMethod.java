package a1_methodoverloading;

public class qMainMethod {
	public static void main(boolean a)
	 {
		 System.out.println("abc");
	 }
		
	 public static void main(int a)
	 {
		 System.out.println("abcd");
	 }
 public static void main(String[] args) {
	 
			qMainMethod.main(false);
			qMainMethod.main(10);
	
		}	
}
//**main method is overloaded because overloading is done by same method name with diff argument.So we  can create 
/// no of method with name"main" but argument should to keep differnt than actual main method.