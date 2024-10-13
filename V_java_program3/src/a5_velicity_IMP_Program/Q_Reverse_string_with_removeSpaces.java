package a5_velicity_IMP_Program;

public class Q_Reverse_string_with_removeSpaces {
	public static void main(String[] args) {
     String s1="vina y ak   kh  e p s ";
     
     String s2=s1.replace(" ", "");
     String s3="";
     
    for(int i=s2.length()-1;i>=0;i--)
    {
    	s3=s3+s2.charAt(i);
    
     }
    System.out.print(s3);
	}
}
