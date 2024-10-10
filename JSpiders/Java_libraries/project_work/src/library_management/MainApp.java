package library_management;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Library l=new Library();
		
		System.out.println("Enter book title");
		String title=sc.nextLine();
		
		
		System.out.println("Enter Book Author name");
		String bookAuthor=sc.nextLine();
		
		System.out.println("Enter Number of pages");
		int noOfPages=sc.nextInt();
		
		System.out.println("Enter Book cost");
		int cost=sc.nextInt();
		
		System.out.println("Enter Book Edition");
		int edition=sc.nextInt();
		
		boolean exit=true;
		
		while(exit)
		{			
            System.out.println("1. addBook");
            System.out.println("2. displayBook");
            System.out.println("3. searchBookBasedOnTitle");
            System.out.println("4. searchBookBasedOnAuthorName");
            System.out.println("5. searchBookBasedOnCost");
            System.out.println("6. updateBookBasedOnCost");
            System.out.println("7. removeBook");
            System.out.println("0. Exit");
			System.out.println("Enter your choice ");
			int choice=sc.nextInt();
			switch(choice) 
			{
			case 0: exit=true;
			break;
			case 1: l.addBook(new Book(title,bookAuthor,noOfPages,cost,edition));
			break;
			case 2: l.displayBook();
			break;
			case 3: l.searchBookBasedOnTitle(null);
			break;
			case 4: l.searchBookBasedOnAuthorName(null);
			break;
			case 5: l.searchBookBasedOnCost(choice);
			break;
			case 6: l.updateBookBasedOnCost(null);
			break;
			case 7: l.removeBook(choice);
			break;
			default:System.out.println("Enter a valid choice");			
			}
		}
		System.out.println("Exited successfully");
	}

}
