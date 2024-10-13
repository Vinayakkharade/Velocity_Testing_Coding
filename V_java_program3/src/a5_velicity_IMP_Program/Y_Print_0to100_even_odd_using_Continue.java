package a5_velicity_IMP_Program;

public class Y_Print_0to100_even_odd_using_Continue {

	public static void main(String[] args) {
		
		// print 0-100 even no using continue keyword
		for(int i=0;i<=100;i++)
		{
			if(i%2!=0)
				continue;
			System.out.print(i+" ");
		}
		System.out.println();
		
		// print 0-100 odd no using continue keyword
				for(int i=0;i<=100;i++)
				{
					if(i%2==0)
						continue;
					System.out.print(i+" ");
				}
				
				
	}
	
	
}
