package Practice_2024;

public class A2_count_spaces_RemoveSpaces {
	
	public static void main(String[] args) {
		
		String s1="vi na yak ";
	
		int count=0;
		for(int i=0;i<s1.length();i++) {
			char space=s1.charAt(i);
			
			if(space==' ') {
				count++;
			}
		
		}
		System.out.println("space count:"+count);
		
		String s2=s1.replaceAll(" ", "");
		System.out.println("removed space string:"+s2);
	}

}
