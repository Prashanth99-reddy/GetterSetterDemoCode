
public class Engineer extends Employee {
	
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
		return grade;
	}
	
	
	public static void main(String[] args) {
		
		Engineer obj = new Engineer();
		obj.label(400000,"A");
		
	}

}
