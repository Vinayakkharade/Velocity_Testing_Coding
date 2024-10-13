package A5_encapsulation1;

import java.util.Scanner;

public class Child {

	public static void main(String[] args) {
		EmpDetails obj=new EmpDetails();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter empid");
		int empid =sc.nextInt();
		if(empid==1234)
		{
			System.out.println("salary="+obj.getsalary());
		}
		else
		System.out.println("Wrong employee id");
		
	}
	
	
}
