import java.util.Scanner;
class Exponential 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base value: ");
		int b=sc.nextInt();
		System.out.println("Enter the power value: ");
		int p=sc.nextInt();
		int exp=1;
		for (int i=1;i<=p ;i++ )
		{
			exp=exp*b;
		}
		System.out.println(exp);
	}
}
