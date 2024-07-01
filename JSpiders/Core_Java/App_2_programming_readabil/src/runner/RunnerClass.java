package runner;

import java.util.ArrayList;

public class RunnerClass {
	public static void main(String[] args) {
		
	Runner r1=new Runner();
	Runner r2=new Runner();
	Runner r3=new Runner();

	//RAW type
	
	ArrayList al=new ArrayList();
	al.add(r1);
	al.add(r2);
	al.add(r3);
	
	System.out.println("*************************************************************************************************************************************");
	Runner run1 =(Runner)al.get(0);
	run1.initialize("Alices", "sprint", 6, 25);
	run1.display();
	System.out.println("*************************************************************************************************************************************");
	
	Runner run2 =(Runner)al.get(1);
	run2.initialize("Bob", "marathon", 8, 30);
	run2.display();
	System.out.println("*************************************************************************************************************************************");
	Runner run3 =(Runner)al.get(2);
	run3.initialize("Jack", "short", 4, 16);
	run3.display();
	System.out.println("*************************************************************************************************************************************");
	
	//GENERIC type
	ArrayList<Runner> al1=new ArrayList();
	al1.add(r1);
	al1.add(r2);
	al1.add(r3);
	
	Runner run4 = al1.get(0);
	run4.initialize("Alice", "marathon", 6, 25);
	run4.display();
	System.out.println("*************************************************************************************************************************************");
	Runner run5 = al1.get(1);
	run5.initialize("Bob", "short", 2, 18);
	run5.display();
	System.out.println("*************************************************************************************************************************************");
	Runner run6 = al1.get(2);
	run6.initialize("Jack", "sprint", 5, 40);
	run6.display();
	System.out.println("*************************************************************************************************************************************");
	
	
	}
}
