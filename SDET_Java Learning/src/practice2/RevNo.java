package practice2;

public class RevNo {
public static void main(String[] args) {
	int num=123;
	int a=0;
	while(num!=0)
	{
		a=(a*10)+(num%10);
		num=num/10;
		
	}
	System.out.println(a);
	
	
}
}
