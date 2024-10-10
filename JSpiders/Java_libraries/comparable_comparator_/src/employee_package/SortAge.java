package employee_package;

import java.util.Comparator;

public class SortAge implements Comparator {
	
		public int compare(Object o1, Object o2) {
		
		Employee emp1 = (Employee) o1;
		Employee emp2 = (Employee) o2;
		
		if(emp1.getEmp_age() > emp2.getEmp_age())
			{
				return 1; 
			}
		else if(emp1.getEmp_age() < emp2.getEmp_age())
		{
			return  -1;
		}
		else
		{
			return 0;
		}
		
	}
	
	
}	