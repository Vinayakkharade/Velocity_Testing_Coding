package a5_velicity_IMP_Program;

public class V_Reverse_string_in_an_Array {
	
	public static String RevString(String s2) {
		String rev="";
		for(int j=s2.length()-1;j>=0;j--)
		
			rev=rev+s2.charAt(j);
			return rev;
		
	}

	public static void main(String[] args) {
     String s1="vinayak soham sarita saurabh";
       String []ar=s1.split(" ");
  
       for(int i=0;i<ar.length;i++)
       {
    	   String s2=ar[i];
    	   ar[i]=RevString(s2);
       }
	for(int i=ar.length-1;i>=0;i--)
	System.out.println(ar[i]);
		
	
		
	}

}
