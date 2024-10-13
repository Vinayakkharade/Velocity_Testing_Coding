package a5_velicity_IMP_Program;

public class prcaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="vinayak soham sarita saurabh";
		String[]a=s1.split(" ");
		
		String s3="";
		for(int i=a.length-1;i>=0;i--)
		{
			//String s2=a.toString();
			s3=s3+(a[i]+" ");
		}
		System.out.println(s3);
		

		String s4="";
		for(int j=s3.length()-1;j>=0;j--)
		{
			s4=s4+s3.charAt(j);
		}
		System.out.println(s4);
	}
	
}
