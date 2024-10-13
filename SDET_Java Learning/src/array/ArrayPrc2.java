package array;

public class ArrayPrc2 {
public static void main(String[]args)
{
   int[]a= {45,98,34,65,76};
   int min=a[0];
   
   for(int i=1;i<a.length;i++)//98
   {
	   if(a[i]<min)  //98<45=false
	   {
		   min=a[i];  //45
	   }
   }
   System.out.println(min);

}
	
	
}
