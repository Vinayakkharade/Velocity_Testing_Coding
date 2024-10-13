package a5_velicity_IMP_Program;

import java.util.Scanner;

public class W_Identify_Odd_no_Or_evenNo {
public static void main(String[] args) {
	
	for(int i=1;i<=50;i++)
	{
	Scanner sc =new Scanner(System.in);
	System.out.println();
	System.out.println("ENTER NUMBER :");
	
	int num=sc.nextInt();
	
	if(num%2==0)
		System.out.println("Given is Even Number");
	else
		System.out.println("Given is Odd Number");
	}
}
}
