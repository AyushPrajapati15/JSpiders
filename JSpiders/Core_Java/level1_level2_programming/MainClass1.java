/*
Wap for the below requirements
a.Create three classes.
First class contains static method
Second class contains static method
Third class contain method and main
Third class static method will call first class and second class static method
main method will call same class static method
*/
class MainClass1
{
	public static void sell()
	{
		System.out.println("Selling books");
		Author.write();
		Publisher.print();
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		sell();
	}
}

class Author
{
	public static void write()
	{
		System.out.println("Writing content");

	}

}

class Publisher
{
		public static void print()
	{
		System.out.println("Printing books");
	}
}
