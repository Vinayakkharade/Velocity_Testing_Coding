package a8_inheritanceHierachical;

class vehicle{
   void m1() {
	   System.out.println("vehicles are running");
   }
}

 class twowheeler extends vehicle{
	 void m2()
	 {
		 System.out.println("two wheeler is running");
	 }
 }

 class threewheeler extends vehicle{
	 
	 void m3()
	 {
		 System.out.println("two wheeler is running");
	 }
 }
public class Prc1Hierachical {
	
	public static void main(String[]args) {
		twowheeler tw=new twowheeler();
		tw.m2();
		tw.m1();
		
		System.out.println("");
		threewheeler thr=new threewheeler();
		thr.m3();
		thr.m1();
		
		
	}

}// one parent class is extended in multiple child classes then it is called as hierachical inheritance.
//multi-level inheritance--- In series form classes get extended & each class will be having all properties of all previous classes.
// --ie chain of inheritance
