package a5_encapsulation2;

public class Child {
public static void main(String[] args) {
	EmpSalary emp1=new EmpSalary();
	
	emp1.setempName("vihaan");
	emp1.setsalary(10000);
	System.out.println("Employee name="+emp1.getempName());
	System.out.println("Salary="+emp1.getsalary());
	
	
	EmpSalary emp2=new EmpSalary();
	
	 emp2.setempName("megha");
     emp2.setsalary(5000);
     System.out.println("Employee name="+emp2.getempName());
     System.out.println("Salary="+emp2.getsalary());
	
}
}
