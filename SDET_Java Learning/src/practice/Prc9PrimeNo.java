package practice;

public class Prc9PrimeNo {
public static void main(String[] args) {

	
	for(int i=2;i<=100;i++) 
	{
		int num=0;
		for(int j=2;j<=i-1;j++)
		{
			if(i%j==0)
			{
				num=num+1;
			}
		}
			if(num==0)
			{
				System.out.println(i);
			}
	}
	
	
	}
}
	
	

