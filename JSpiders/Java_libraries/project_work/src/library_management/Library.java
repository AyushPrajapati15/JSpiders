package library_management;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Library {
	Scanner sc=new Scanner(System.in);
	
	private static int id=1204;
	private static String libraryName="Pathshala";
	private Book b;
	
	ArrayList<Book> al=new ArrayList<Book>();
	public void addBook(Book b)
	{
		
		
		al.add(b);
		System.out.println("Book Added successfully");
	}
	
	public void displayBook()
	{
		if(al.isEmpty())
		{
			System.out.println("No book to display");
		}
		else
		{
			for(Book book:al)
			{
				book.displayBook();
				
			}
		}
	}
	
	
	public void searchBookBasedOnTitle(String title)
	{
		if(al.isEmpty())
		{
			System.out.println("No book to found");
		}
		else
		{
			for(Book book:al)
			{
				if(book.getTitle().equalsIgnoreCase(title))
				{
					System.out.println("Book found successful");
					b.displayBook();
				}
			}
		}
	}
	public void searchBookBasedOnAuthorName(String authorName)
	{
		if(al.isEmpty())
		{
			System.out.println("No book to Found");
		}
		else
		{
			for(Book book:al)
			{
				if(book.getBookAuthor().equalsIgnoreCase(authorName))
				{
					System.out.println("Book found successful");
					b.displayBook();
				}
			}
		}
	}
	public void searchBookBasedOnCost(int cost)
	{
		if(al.isEmpty())
		{
			System.out.println("No book to Found");
		}
		else
		{
			for(Book book:al)
			{
				if(book.getCost()==cost)
				{
					System.out.println("Book found successful");
					b.displayBook();
				}
			}
		}
	}
	public void updateBookBasedOnCost(String title)
	{
		if(al.isEmpty())
		{
			System.out.println("No book to Found");
		}
		else
		{
			int cost=1000;
			for(Book book:al)
			{
				if(book.getTitle().equalsIgnoreCase(title))
				{
					System.out.println("Book found successful");
					b.setCost(cost);
				}
			}
		}
	}
	
	public void removeBook(int noOfPages)
	{
		if(al.isEmpty())
		{
			System.out.println("No book to Found");			
		}
		else
		{
			Iterator<Book> itr=al.iterator();
			while(itr.hasNext())
			{				
				Book book =itr.next();
				if(book.getNoOfPages()==noOfPages)
				{
					itr.remove();
				}
			}
		}
		
	}
}
