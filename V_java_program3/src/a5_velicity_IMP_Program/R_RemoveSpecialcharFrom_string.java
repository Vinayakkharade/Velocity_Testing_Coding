package a5_velicity_IMP_Program;

public class R_RemoveSpecialcharFrom_string {

	public static void main(String[] args) {
		String s1="as%%(^^0479opAKKqio*!__ASL121!";
		
		String s2=s1.replaceAll("[^A-Za-z0-9]", "");
		
		System.out.print(s2);
	}

}
