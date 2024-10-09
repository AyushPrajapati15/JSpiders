import java.util.ArrayList;

public class EmployeeDriver {
	public static void main(String[] args) {
		
	Employee emp=new Employee("Alice",1024,55000,"Hyderabad","Developer");
	Employee emp1=new Employee("Bob",2048,62000,"Banglore","Tester");
	Employee emp2=new Employee("Jack",4096,75000,"Chennai","HR");
	
	ArrayList al=new ArrayList();
	al.add(emp);
	al.add(emp1);
	al.add(emp2);
	
	for(Object obj:al)
	{
		Employee e=(Employee)obj;
		if(e.getSal()>50000)
		{
			System.out.println(e.getName());
			System.out.println(e.getId());
			System.out.println("--------------------------------------------------");
		}
	}
	for(Object obj:al)
	{
		Employee e=(Employee)obj;
		if(e.getName().equalsIgnoreCase("Developer"))
		{
			System.out.println(e.getSal());
		}
	}
	for(Object obj:al)
	{
		Employee e=(Employee)obj;
		if(e.getLocation().equalsIgnoreCase("Banglore"))
		{
			e.display();
		}
	}
	
	for(Object obj:al)
	{
		Employee e=(Employee)obj;
		if(e.getLocation().equalsIgnoreCase("Hyderabad"))
		{
			e.setSal(59000);
			e.display();
		}
	}
	
	
	
	}

}
