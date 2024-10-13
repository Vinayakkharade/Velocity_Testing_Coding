package stringpractice;

public class AlphabetOrder {
	public static void main(String[] args) {
   String s1="vivh";
   char temp ;
   char []arr=s1.toCharArray(); //string into array(array index starts from zero)
	for(int i=0;i<s1.length();i++)
	{
		for(int j=i+1;j<s1.length();j++)
		{
			if(arr[i]>arr[j])
			{
				 temp=arr[i];
			     arr[i]=arr[j];
			     arr[j]=temp;	
		}
	}
		
	}
	 System.out.println(new String(arr));
	}	
	}
////
