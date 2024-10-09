
public class Employee {
	private String name;
	private int id;
	private int sal;
	private String location;
	private String desg;
	
	public Employee()
	{
		
	}
	public Employee(String name,int id,int sal,String location,String desg)
	{
		this.name=name;
		this.id=id;
		this.sal=sal;
		this.location=location;
		this.desg=desg;
	}
	//Getters & Setters for NAME
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	//Getters & Setters for ID
	public void setName(int id)
	{
		this.id=id;
	}
	public int getName()
	{
		return id;
	}
	//Getters & Setters for SAL
	public void setName(int sal)
	{
		this.sal=sal;
	}
	public int getName()
	{
		return sal;
	}
	//Getters & Setters for SAL
	public void setName(String location)
	{
		this.location=location;
	}
	public String getName()
	{
		return location;
	}
	//Getters & Setters for SAL
	public void setName(String desg)
	{
		this.desg=desg;
	}
	public String getName()
	{
		return desg;
	}
	
	
	
	
	
	public void display()
	{
		System.out.println("Employee Name is "+name);
		System.out.println("Employee Id is "+id);
		System.out.println("Employee Salary is "+sal);
		System.out.println("Employee Location is "+location);
		System.out.println("Employee Desgination is "+desg);
	}

}
