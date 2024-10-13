package patternprogram;

public class a9_pattern95 {
public static void main(String[] args) {
	int space=2;//1
	int star=1;//3
	
	for(int i=1;i<=5;i++)
	{
		int count=5;
		for(int j=1;j<=space;j++)
		{
		System.out.print(" ");
		}
	    for(int k=1;k<=star;k++)
	    { 	
	    	System.out.print(count);//54
	    	count--;
	    }
		if(i<3) {
			star=star+2;
		  space--;
		 
		}
		else
		{
			star=star-2;
			space++;
			
		}
		System.out.println();
	}

}
}
