package a1_methodoverloading;

public class ChildClass extends ParentClass{
 public void m1(boolean a)
 {
	 System.out.println("123");
 }
	
 public void m1(int a)
 {
	 System.out.println("1234");
 }
public static void main(String[] args) {
	 ChildClass obj1=new ChildClass();
	obj1.m1(false);
	obj1.m1(10);
	obj1.m1();
	ParentClass obj2=new ChildClass();
	obj2.m1();

}	
 
}//polymorpism:Method having diff form with same name is called as polymorpism.
//Method overloading--Method with same name with diff argument in same class as well as in inhirrated class is called as method overloading.
//jiska ref ahe uska method compiler suggest karega & wahi chalega in overloading.
//ie means whose ref is found that class method will run in method overloading.
//adv--it increases the readability of program
//**IMP NOTES OF OVERLOADING:1)Method overloading is called as compile time polymorpism(early binding)
//2)Reason--on compilation time of program for method overloading we will know that which method will get execute.
//In overloading resolution is based  on reference variable.


//Method overloading--compile time polymorpism--early binding-- static binding
//Method overriding-- run time polymorpism-- late binding-- dynamic  binding

