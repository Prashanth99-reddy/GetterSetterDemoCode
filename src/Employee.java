
public abstract class Employee {
	
	
	public abstract void setSalary(int salary);
	public abstract int getSalary();
	public abstract void setGrade(String grade);
	public abstract String getGrade();
	void label(int salary,String grade) {
		System.out.println("Employee's data:");
		System.out.println("Salary:"+salary);
		System.out.println("Grade:"+grade);
	}

}
