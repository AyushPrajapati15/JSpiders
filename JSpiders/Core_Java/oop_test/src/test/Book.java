/*wap for the below requirement
 1.Program for book
 2.Book data menbers (variables) are 
 	a.Book id 
 	 -->get 3 letters of book title
 	 -->generate a random number by using next int (int number) non-static of random class present in java.util package
 	 -->EX:- Random r=new Random();
 	 
 	b. book title
 		-->combiation of 2 words. //words
 		-->minimum 2 letters.
 		-->alphabet,number,underscore allowed other character not allowed//char
 		-->minimum 2 alphabet,1digit,underscore is mandatory.////letters
 		++
 	c. book cost
 		-->its always between 200-1000
 	
 	c. noOfPages its between 100-400
 		
 	c. book author
 		-->combinations of 2 words
 		-->each word first letter should be uppercase.
 	
 	d. create a separate method to validate each and every data member 
 		NOTE: method should be returning boolean type of data 
 		if data is valid then initialize the book data in a constructor else print data mismatch
 	
 	e.initialize the book members by using constructor
 	
 	f.create separate helper method for each and every data member for updation purpose
 		EX. public void updateBookCost(int cost);
 		
 	g.create separate helper method for each and every datamember to return the data
 		EX: public int getBookCost()
 		{
 			return cost;
 		}
 	h.create methods to display book details
 		
 	i. create Book driver class
 		-->create book object and store the details in an arraylist using generics
 		-->print book details in an array list using 
 
  */
package test;

import java.util.Random;

public class Book {
	
	public int bookId;
	public String bookTitle;
	public int bookCost;
	public int noOfPages;
	public String bookAuthor;
	
	public Book(String bookTitle,int bookCost)
	{		
			
			
	}
	
	public void updatebookId()
	{
		Random r=new Random();
		this.bookId=r.nextInt(0,999);
	}
	
	public void updatebookTitle(String bookTitle)
	{
		this.bookTitle=bookTitle;
		
	}
	public void updatebookCost(int bookCost) 
	{
		this.bookCost=bookCost;
		
	}
	public void updatenoOfPages(int noOfPages) 
	{
		this.noOfPages=noOfPages;
		
	}
	public void updatebookAuthor(String bookAuthor) 
	{
		this.bookAuthor=bookAuthor;
		
	}
	
	
	
	
	//CHECK BOOK TITLE
	private boolean checkTitleWords(String s)
	{
		int alphaCount=0;
		int digitCount=0;
		int specialCount=0;
		
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='z')
			{
				alphaCount++;
			}
			else if(s.charAt(i)>='1'&&s.charAt(i)<=9)
			{
				
				digitCount++;
			}
			else
			{
				specialCount++;
			}
		}
		if(alphaCount>=2&&digitCount>=1&&specialCount>=1)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	//CHECK BOOK TITLE
	private boolean checkTitleLetters(String s)
	{
		String []str=s.split(" ");
		if(str.length>=2)
		{
			return true;
		}
		else {
			
			return false;
		}
		
	}
	//CHECK BOOK TITLE
	private boolean checkTitleCharacters(String s)
	{
		boolean isPresent=true;
		for(int i=0;i<=s.length()-1;i++)
		{
			if((s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='z'||s.charAt(i)=='_'||s.charAt(i)>='1'&&s.charAt(i)<=9))
			{
				isPresent=true;
			}
			else {
				isPresent=false;
				break;
			}
			
		}
		if(isPresent)
		{
		return true;
		}
		else
		{
		return false;
		}
	}
	
	
	//BOOK COST
	private boolean checkBookCost(int bookCost)
	{
		if(bookCost>=200&&bookCost<=1000)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	//NO OF PAGES
	private boolean checkBookPage(int noOfPages)
	{
		if(noOfPages>=100&&noOfPages<=400)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// BOOK AUTHOR
	private boolean checkBookAuthor(String bookAuthor)
	{
		String[]str=bookAuthor.split(" ");
		if(str.length==2)
		{
			return true;
		}
		else {
			return false;
		}
		
	}
	
	// BOOK AUTHOR
	private boolean checkBookAuthorLetters(String bookAuthor)
	{
		String[]str=bookAuthor.split(" ");
		for(int i=0;i>=str.length-1;i++)
		{
			for(int j=0;j>=str[i].length()-1;j++)
			{
				if(str[0]>='A'&&str[0]<='Z')
				{
					
				}
			}
			
		}
	
		
		
	}
	
	
	
	
	
//	public static void main(String[] args) {
//		Book b1=new Book();
//		System.out.println(b1.bookId);
//	}
	
	
	

}
