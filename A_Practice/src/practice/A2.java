package practice;

public class A2 {

	public static void main(String[] args) {
		String s1="vinayak kharade vinayak";
		int count=0;
		String[]a=s1.split(" ");
		for(int i=0;i<a.length;i++)
		{
			String s2=a[i];
			if(s2.equals("vinayak"))
				count++;

		}
		System.out.println(count);
	}

}
