package a4_typeCating;

public class A2_DownCasting {
public static void main(String[] args) {
	int a=200;
	
	byte b=(byte)a;
	System.out.print(b);
}
}
///2)Down casting-- converting higher data type into lower data type.
///while performing down casting there is loss of information(because higher data type max range is not available in lwr data type)