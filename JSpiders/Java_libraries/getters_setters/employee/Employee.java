
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
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	//Getters & Setters for SAL
	public void setSal(int sal)
	{
		this.sal=sal;
	}
	public int getSal()
	{
		return sal;
	}
	//Getters & Setters for SAL
	public void setLocation(String location)
	{
		this.location=location;
	}
	public String getLocation()
	{
		return location;
	}
	//Getters & Setters for SAL
	public void setDesg(String desg)
	{
		this.desg=desg;
	}
	public String getDesg()
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
