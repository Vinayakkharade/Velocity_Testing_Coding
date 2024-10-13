package patternprogram;

public class a9_pattern92 {
public static void main(String[] args) {
	int num=3;
	//int count=3;
	for(int i=1;i<=3;i++)
	{
		for(int j=3;j>=num;j--)
		{
			System.out.print(j);
		}
		System.out.println();
		num--;
	}
	
	int num1=2;
	for(int i=1;i<=2;i++)
	{
		int count=3;
		for(int j=1;j<=num1;j++)
		{
			System.out.print(count);//32
			count--;
		}
		System.out.println();
	    num1--;
	    
	}
	
}
}
/*	  	 
3
32
321
32
3	  	
*/

