package a5_velicity_IMP_Program;

public class P_Remove_space_from_String {

	public static void main(String[] args) {
		
		String s1="v in a ya k kha ra de";
		String s2=s1.replace(" ", "");
		System.out.print(s2);
		
	}

}
//replace -replaces the old char by new char(replacement procceds from beginning to end of string)
// example- "aaa"---replace aa by b  result ba