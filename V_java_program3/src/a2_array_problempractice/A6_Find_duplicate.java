package a2_array_problempractice;

public class A6_Find_duplicate {
	public static void main(String[] args) {
	    int[]a= {12,1,90,35,90,15,35,88,12,88};
	    
	    for(int i=0;i<a.length;i++)
	    {
	    	for(int j=i+1;j<a.length;j++)
	    	{
	    		if(a[i]==a[j])
	    			System.out.println(a[i]);
		    }	
	    	}
	    
	    }
}
