package a6_Encapsulation4;

import java.util.Scanner;

public class RetriveBalance {

public static void main(String[] args) {
	Bank obj=new Bank();
	Scanner sc=new Scanner(System.in);// invoke the scanner (it takes input from system)
	System.out.print("enter pin");
	int pin=sc.nextInt();
   if(pin==1234)
   {
	  
   int bal=obj.getbalance();
	System.out.print("Account balance="+bal);
	
	
   }
   else
	System.out.print("Wrong pin");

}
}
// here we declare the balance as private .this used in public method.this method is accessed in another class.
/// when we enter the correct pin then we can access it data which hided.but here we are hiding implimentation which req
/// for performing operation.
/// this is doing for security purpose.so no one can access the your data.
/// we can use the getter & setter method
/// getter method is used to read the data or retrive the data.
/// setter method is used to set or write data .
//