package employee_package;

import java.util.Comparator;

public class SortSal implements Comparator {
	
		public int compare(Object o1, Object o2) {
		
		Employee emp1 = (Employee) o1;
		Employee emp2 = (Employee) o2;
		
		if(emp1.getEmp_salary() > emp2.getEmp_salary())
			{
				return 1; 
			}
		else if(emp1.getEmp_salary() < emp2.getEmp_salary())
		{
			return  -1;
		}
		else
		{
			return 0;
		}
		
	}
	
	
}	