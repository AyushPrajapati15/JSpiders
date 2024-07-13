//WAPTP the sum of the number if it is prime.
import java.util.Scanner;
class SumOfNumberIsPalindromeOrNot
{
	public static boolean isPalindrome(int n) 
	{
		int temp=n;
		int rem=0;
		while (n!=0)
		{
			rem=rem*10+(n%10);
			n/=10;
		}
		if (temp==rem)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static int sum(int n) 
	{
		int add=0;
		while (n!=0)
		{
			add=add+(n%10);
			n/=10;
		}
		return add;
	}


	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		if(isPalindrome(num))
		{
		System.out.println(sum(num));
		}
		else
		{
			System.out.println("The number is not palindrome");
		}
	}
}
