package a6_operators;

public class Prc2LogicalOperator {

public static void main(String[]args)
{
  int age=8;
 int percentage=75;
 
   if((age>=18)&&(percentage>=50))
	System.out.println("Eligible for loan");
   else
	System.out.println("Not Eligible for loan");
   System.out.println("----------");
   
   
   if((age>=18)||(percentage>=50))
		System.out.println("Eligible for loan");
	   else
		System.out.println("Not Eligible for loan");
   
   
}	
}
//&& --logical AND operator ---both condition should be true.
//-||--logical OR operator---if any one condition is true then if block statement is printed
//>= -- relational operator--- it check the relation bet operand.(a=x+y)