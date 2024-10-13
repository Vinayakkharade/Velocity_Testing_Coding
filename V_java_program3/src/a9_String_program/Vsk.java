package a9_String_program;

public class Vsk {

	public static void main(String[] args) {
		int num=153;

		int a=0;

		while(num!=0)
		{
		a=(a*10)+(num%10);
		num=num/10;

		}
		System.out.println(a);

	
	}

}
