
package practice;

public class prc4ReverseNo {
   public static void main(String[]args) {
	   int num=123;
	  int a=0;
	   
	   while(num!=0) {
	   a=(a*10)+(num%10);//a=3,32,321
	   num=num/10;//12,1,0
	   
	   }
		System.out.println("reverse no="+a);   
	  
   }
}
