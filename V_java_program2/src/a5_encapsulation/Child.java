package a5_encapsulation;

import java.util.Scanner;

public class Child {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the pin:");
		Encapsulation1 obj=new Encapsulation1();
		int pack=obj.getsalery();
		int pin=sc.nextInt();
		if(pin==1234)
		{
			System.out.print("Emp. salary="+pack);
		}
		else
			System.out.print("Wrong pin");
	
		
	}
	
}
