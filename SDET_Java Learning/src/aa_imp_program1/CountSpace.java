package aa_imp_program1;

public class CountSpace {
public static void main(String[] args) {
	String s1="face b oo k";
	 int count = 0;
  for(int i=0;i<s1.length();i++)
  {
		
	  char st=s1.charAt(i);
  
	  if(st==' ')
	  {
		  count++;
	  }
	 
}
	System.out.print(count);
}
}
