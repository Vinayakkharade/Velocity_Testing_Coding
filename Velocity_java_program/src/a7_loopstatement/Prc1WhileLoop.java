package a7_loopstatement;

public class Prc1WhileLoop {
public static void main(String[]args)
{
	int a=0;
	System.out.println("Even number");
	while(a<=100)
	{
	if(a%2==0)
		System.out.println("Even no="+a);
	
	a++;

	}
}
	
}
//Loops-Loops are used to initialize the variables as well as repeat the certain logic  no of times.
//types-1)while loop---1st condition is checked & then block of code/logic is executed.
//2)do-while loop---1st block of code is executed & then condition is checked.
/// if in do while loop the condition is false but atleast one time block of code is executed.
//For printing infinite block of code we mostly use the while loop.But it is also possible by for loop but it require the lot of logic on that. 
