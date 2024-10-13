package a5_velicity_IMP_Program;

public class O_Count_space_inString {
	public static void main(String[] args) {
	String s1="v in a ya k kha ra de";
	int count=0;
	for(int i=0;i<s1.length();i++)
	{
		char ch=s1.charAt(i);
		 if(ch==' ')
		 
			 count++;
		 
	}
	System.out.println(count);
	System.out.println(s1.length());
	}
}
