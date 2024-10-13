package a7_ProgramPractice;

public class b_EvenoddNO_forloop {
public static void main(String[]args) {
	
	for(int i=0;i<=10;i++) {
		if(i%2==0)
			System.out.print(i+" ");
	}
	System.out.println(" ");
	
	for(int i=10;i>=0;i--) {
		if(i%2==0)
			System.out.print(i+" ");
	}
	System.out.println();
	
	for(int i=0;i<=10;i++) {
		if(i%2!=0)
			continue;
			System.out.print(i+" ");
	}
}
}
