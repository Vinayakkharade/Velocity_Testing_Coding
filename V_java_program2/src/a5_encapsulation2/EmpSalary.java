package a5_encapsulation2;

public class EmpSalary {
    private String empName;
	private int Salary;
	
	public int getsalary()
	{
		return Salary;
	}
	
	public void setsalary(int Salary)
	{
		this.Salary=Salary;
	}
	
	public String getempName()
	{
		return empName;
	}
	
	public void setempName(String empName )
	{
		this.empName=empName;
	
	}
	
}
