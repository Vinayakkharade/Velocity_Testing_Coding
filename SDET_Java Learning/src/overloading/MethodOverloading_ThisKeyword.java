package overloading;

public class MethodOverloading_ThisKeyword {
	int a;// global variable
	int b;// global variable
	
	void sum()
	{
		a=100;
	    b=200;
		System.out.println(a+b);
	}
  void sum(int a,int b)
  {
	//  this.a=a;
	// this.b=a;
	  System.out.println(a-b);
   }
  
 public static void main(String[] args) {
	
	 MethodOverloading_ThisKeyword mo=new MethodOverloading_ThisKeyword();
	 mo.sum();
	 mo.sum(500,50);
}
}