import java.util.*;
class PalindromeUsingTwoMethod 
{
	public static int reverse(int n) 
	{
		int rev=0;
		while (n!=0)
		{
			rev=rev*10+(n%10);
			n/=10;
		}
		return rev;
	}
	public static boolean isPalindrome(int n,int rev) 
	{
		if (n==rev)
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
		int rev=reverse(num);
		if (isPalindrome(rev,num))
		{
			System.out.println("Number is palindrome");
		}
		else 
		{
			System.out.println("Number is not palindrome");
		}
		
	}
}
