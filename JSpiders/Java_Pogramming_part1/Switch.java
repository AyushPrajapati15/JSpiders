import java.util.Scanner;
class Switch 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		switch(a)
		{
			case 1: System.out.println("Hello");
			break;
			case 2: System.out.println("Hi");
			break;
			case 3: System.out.println("Number");
			break;
			case 4: System.out.println("Coffee");
			break;
			case 5: System.out.println("Block");
			break;
			default:System.out.println("Enter a valid input");
		}
	}
}
