package stringpractice;

public class DuplicateRemove {
	public static void main(String[] args) {

    String s1="vvihaan";
	
    StringBuilder sb1=new StringBuilder();/// predefined class in java
       s1.chars().distinct().forEach(c -> sb1.append((char)c));
       System.out.print(sb1);
       
	}		
	}
