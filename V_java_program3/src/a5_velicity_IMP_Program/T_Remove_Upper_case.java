package a5_velicity_IMP_Program;

public class T_Remove_Upper_case {
	public static void main(String[] args) {
		String s1="as%%(^^0479opAKKqio*!__ASL121!";

		String s2=s1.replaceAll("[A-Z]", "");

		System.out.print(s2);
}
}