package employee_package;

public class Employee implements Comparable {
	private int emp_id;
	private String emp_name;
	private int emp_age;
	private int emp_salary;
	public Employee(int emp_id, String emp_name, int emp_age, int emp_salary) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_age = emp_age;
		this.emp_salary = emp_salary;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public int getEmp_age() {
		return emp_age;
	}
	public void setEmp_age(int emp_age) {
		this.emp_age = emp_age;
	}
	public int getEmp_salary() {
		return emp_salary;
	}
	public void setEmp_salary(int emp_salary) {
		this.emp_salary = emp_salary;
	}
	@Override
	public int compareTo(Object o) {
		
		Employee emp = (Employee) o;
		
		if(emp.getEmp_id() > getEmp_id())
			{
				return 1; 
			}
		else if(emp.getEmp_id() < getEmp_id())
		{
			return  -1;
		}
		else
		{
			return 0;
		}
		
	}
	
	

	
}