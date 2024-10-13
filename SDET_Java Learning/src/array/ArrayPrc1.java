package array;

public class ArrayPrc1 {
	public static void main(String[]args)
	{
		int[]a= {20,45,18,5};
	   int max=a[0];
		
	   for(int i=1;i<a.length;i++)//
	   {
		  if(a[i]>max)
		  {
		 max=a[i];
		  }
	   }
		  System.out.println(max);
		 }
	}
	


