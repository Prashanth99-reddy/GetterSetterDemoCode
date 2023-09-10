
public class Manager extends Employee {
	
	private int salary;
	private String grade;

	@Override
	public void setSalary(int salary) {
         this.salary=salary;		
	}

	@Override
	public int getSalary() {
		
		return salary;
	}

	@Override
	public void setGrade(String grade) {
		this.grade=grade;
		
	}

	@Override
	public String getGrade() {
		// TODO Auto-generated method stub
		return grade;
	}
	
	public static void main(String[] args) {
		
		Manager mgr = new Manager();
		mgr.label(50000,"B");
	}

}
