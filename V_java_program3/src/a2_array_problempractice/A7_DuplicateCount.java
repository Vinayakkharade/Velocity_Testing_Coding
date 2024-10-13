package a2_array_problempractice;

public class A7_DuplicateCount {
	
	public static void main(String[] args) {
	    int[]a= {12,1,90,35,90,15,35,88,12,88};
	    int count=0;
	    for(int i=0;i<a.length;i++)
	    {
	    	for(int j=i+1;j<a.length;j++)
	    	{
	    		if(a[i]==a[j])
	    			count++;
		    }	
	    	}
	    System.out.println(count);
	    }

}
