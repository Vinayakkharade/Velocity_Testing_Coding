package practice2;

public class PrimeNo {
public static void main(String[] args) {
	int a=0;
	for(int i=2;i<=50;i++)
	{
		for(int j=2;j<i-1;j++)
		{
			if(i%j==0)
				a=a+1;
		}
		
		if(a==0)
			System.out.println(i);
		else
			a=0;
	}
	
	
}
	
}
