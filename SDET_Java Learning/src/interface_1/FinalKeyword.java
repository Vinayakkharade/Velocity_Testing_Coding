package interface_1;

final class A     /// cannot accuire the anything(variables & methods) from parent class
 {
final int a=10;     // value of variable is constant
final void display()   /// method cannot be override
	 {
	// a=10;
	 System.out.println(a);
	 }
 }

 class B extends A
 {
	 void display()
	 {
	// a=20;
	 System.out.println("AASS");
	 }
 }



















public class FinalKeyword {

	public static void main(String[] args) {
		
		
		
	}
	
	
}
