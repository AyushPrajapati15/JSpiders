//waptp user_name user defined times
import java.util.Scanner;
class UserName 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Enter How many times you want to print");
		int num=sc.nextInt();
		for (int i=1;i<=num ;i++ )
		{
		System.out.println(name);
		}

	}
}
