package employee_package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {
	public static void main(String[] args)
	{
		List<Employee> li = new ArrayList<>();
		li.add(new Employee(101, "Alice",25,24000 ));
		li.add(new Employee(105, "Bob",22,28000 ));
		li.add(new Employee(104, "Jack",28,35000 ));
		li.add(new Employee(108, "Scoot",35,27000 ));
		li.add(new Employee(102, "Jerry",42,19000 ));
		
		
		System.out.println("Before Sorting...");
		
		for(Employee e : li)
		{
			System.out.println(e.getEmp_id()+" "+e.getEmp_name()+" "+e.getEmp_salary()+" "+e.getEmp_age());
		}
		System.out.println();
		Collections.sort(li);
		
		System.out.println("After Sorting...");
		
		for(Employee e : li)
		{
			System.out.println(e.getEmp_id()+" "+e.getEmp_name()+" "+e.getEmp_salary()+" "+e.getEmp_age());
		}
		System.out.println();
		
		
		System.out.println("Before Sorting Age...");
		
		for(Employee e : li)
		{
			System.out.println(e.getEmp_id()+" "+e.getEmp_name()+" "+e.getEmp_salary()+" "+e.getEmp_age());
		}
		System.out.println();
		
		Collections.sort(li, new SortAge());
		
		System.out.println("After Sorting Age...");
		
		for(Employee e : li)
		{
			System.out.println(e.getEmp_id()+" "+e.getEmp_name()+" "+e.getEmp_salary()+" "+e.getEmp_age());
		}
		System.out.println();
		
		System.out.println("Before Sorting Salary...");
		
		for(Employee e : li)
		{
			System.out.println(e.getEmp_id()+" "+e.getEmp_name()+" "+e.getEmp_salary()+" "+e.getEmp_age());
		}
		System.out.println();
		
		Collections.sort(li, new SortSal());
		
		
		System.out.println("After Sorting Age...");
		
		for(Employee e : li)
		{
			System.out.println(e.getEmp_id()+" "+e.getEmp_name()+" "+e.getEmp_salary()+" "+e.getEmp_age());
		}
		System.out.println();
		
		
	}
}