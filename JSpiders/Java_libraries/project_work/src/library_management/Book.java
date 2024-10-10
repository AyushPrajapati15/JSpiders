package library_management;

import java.util.Random;

public class Book {
	
	private String title;
	private String bookAuthor;
	private int noOfPages;
	private int cost;
	private int id;
	private int edition;
	
	public Book() {}
	
	
	Random r=new Random();
	
	public Book(String title, String bookAuthor, int noOfPages, int cost, int edition) {
		this.id=r.nextInt(999);
		this.title = title;
		this.bookAuthor = bookAuthor;
		this.noOfPages = noOfPages;
		this.cost = cost;
		this.edition = edition;
	}




	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}
	public int getId()
	{
		return id;
	}
	
	public void displayBook()
	{
		System.out.println("Book Id is:"+getId());
		System.out.println("Book Title is:"+getTitle());
		System.out.println("Book Author is:"+getBookAuthor());
		System.out.println("Book No of pages is:"+getNoOfPages());
		System.out.println("Book Cost is:"+getCost());
		System.out.println("Book Edition is:"+getEdition());
	}




	@Override
	public String toString() {
		return "Book [title=" + title + ", bookAuthor=" + bookAuthor + ", noOfPages=" + noOfPages + ", cost=" + cost
				+ ", id=" + id + ", edition=" + edition + "]";
	}
	
	
	
	
	
	
}
