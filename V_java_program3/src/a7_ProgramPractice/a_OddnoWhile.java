package a7_ProgramPractice;

public class a_OddnoWhile {
public static void main(String[] args) {
	int a=1;
	while(a<=50)
	{
		if(a%2==0)
			System.out.print(a+" ");
		a++;
	}
	int b=1;
	System.out.println();
	do {
		if(b%2==0)
			System.out.print(b+" ");
		b++;
	}
	while(b<=100);
}
}
