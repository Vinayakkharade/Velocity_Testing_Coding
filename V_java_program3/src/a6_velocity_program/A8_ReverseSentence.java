package a6_velocity_program;

public class A8_ReverseSentence {

	public static void main(String[] args) {
		String s1 = "This is String";

		String[]a=s1.split(" ");
		  System.out.println(a);
		for(int i=a.length-1;i>=0;i--)
		{
		     System.out.print(a[i]+" ");
		}
	}
}
