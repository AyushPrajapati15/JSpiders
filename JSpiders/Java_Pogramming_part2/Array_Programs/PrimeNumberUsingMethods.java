import java.util.*;
class PrimeNumberUsingMethods 
{
	public static boolean isPrime(int n)
	{
		int count=0;
		for (int i=1;i<=n ;i++ )
		{
			if (n%i==0)
			{
				count++;
			}
		}
		if (count==2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		if (isPrime(num))
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not Prime number");
		}
	}
}
