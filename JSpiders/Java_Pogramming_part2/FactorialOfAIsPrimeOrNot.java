//waptc the factorial of a number is prime or not
import java.util.*;
class FactorialOfAIsPrimeOrNot
{
	public static int factorial(int n)
	{
		int fact=1;
		for (int i=2;i<=n ;i++ )
		{
			fact=fact*i;
		}
		return fact;
	}
	public static boolean isPrime(int n)
	{
		int count=0;
		for (int i=1;i<n ;i++ )
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
		int fact=factorial(num);
		if (isPrime(fact))
		{
			System.out.println("Factorial of a number is Prime");
		}
		else
		{
			System.out.println("Factorial of a number is not Prime");
		}
	}
}
