package practice_java;

public class ss {
	
	public static String revString(String s1) {
		String rev="";
		
		for(int i=s1.length()-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
		}
		
		return rev;
		
	}

	public static void main(String[] args) {

		String[]a= {"cba","abc","nup11"};

		for(int i=1;i<a.length;i++) {

			String s1=a[i];
			
			String s2=revString(s1);
			
			if(a[0].equalsIgnoreCase(s2)) {
				System.out.println(a[0]+" equal to "+ s1);
			}
			
		}

	}
}
