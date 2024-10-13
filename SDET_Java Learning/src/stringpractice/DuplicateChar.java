package stringpractice;

public class DuplicateChar {
public static void main(String[] args) {
	String s1="vihaaan";
	
	char []ch=s1.toCharArray();
	int length=s1.length();
	
	for(int i=0;i<length;i++)
	{
		for(int j=i+1;j<length;j++)
		{
			if(ch[i]==ch[j])
			
              System.out.println(ch[j]);
              break;
		}
	}
	
}
}
