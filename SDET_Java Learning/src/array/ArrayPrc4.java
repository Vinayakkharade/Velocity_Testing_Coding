package array;

public class ArrayPrc4 {
public static void main(String[]args)
{
  int[]a= {50,25,70,30,45,55,12};
  
 for(int i=0;i<a.length;i++)
	if(a[i]%2==0)
	System.out.println("Even no="+a[i]);
 System.out.println("-------");
 
 for(int i=0;i<a.length;i++)
	if(a[i]%2!=0)
	System.out.println("Odd no="+a[i]);	
	
}	
}
