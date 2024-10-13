package Java_Simple_Program_2024;

public class Fibnosis_Series {
	
	public static void main(String[] args) {
		
		//0+1=1
		  //1+1=2
		    //1+2=3
		      //2+3=5
		
		int num1=0;
		int num2=1;
		int sum= 0;
		
		for(int i=0;i<=10;i++) {
			System.out.println(sum);
			sum=num1+num2;
			num1=num2;
			num2=sum;
			
			
		}
	}

}
