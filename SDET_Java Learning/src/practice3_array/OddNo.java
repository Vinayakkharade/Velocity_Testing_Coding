package practice3_array;

public class OddNo {
	public static void main(String[] args) {
		
		int[]ar= {54,3,90,56,9,17};
		
		int length=ar.length;
	
		for(int i=0;i<length;i++)
		{
			if(ar[i]%2==0)
				System.out.print("even no="+ar[i]+" \r");
			else
				System.out.println("Odd no="+ar[i]+" ");
		}
		   System.out.println();
			
	}
	}
	

