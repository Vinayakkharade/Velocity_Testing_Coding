package Java_Simple_Program_2024;

public class typeCasting {

	public static void main(String[] args) {
		
		//Widening--lower data into the higher data type(short>>int)
		
		short a=10;
		
		int b=(int)a;
		
		System.out.println(b);
		
		//Narrowing-- higher to lower(int>>short)
		
		int x=100;
		
		//short y=(short)int;
		
		//Upcasting-- Convert the child class into parent(child class object ref type cast into parent)
		
		//parent obj=(parent)child;
		
		//Down casting-- type cast the parent into child--loss of information-- get class cast exception
		
		//child obj2=(child)parent;
		
		
	}
}
