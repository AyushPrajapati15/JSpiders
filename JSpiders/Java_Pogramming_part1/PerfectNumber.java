import java.util.Scanner;
class PerfectNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check whether it is a perfect number or not");
		int n=sc.nextInt();
		int sum=0;
		for (int i=1;i<=n/2 ;i++ )
		{
			if (n%i==0)
			{
				sum=sum+i;
			}
		}
		if (n==sum)
		{
			System.out.println("Perfect number");
		}
		else
		{
			System.out.println("Not a perfect number");
		}
	}
}
