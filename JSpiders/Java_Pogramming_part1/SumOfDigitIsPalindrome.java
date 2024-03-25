// Check if the sum of digits of n is palindrome or not
import java.util.Scanner;
class  SumOfDigitIsPalindrome
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		int ld=0;
		while (temp!=0)
		{
			ld=temp%10;
			sum=sum+ld;
			temp=temp/10;
		}
		 temp=sum;
		int rev=0;
		while (temp!=0)
		{
			ld=temp%10;
			rev=rev*10+ld;
			temp/=10;
			
		}
		if (rev==sum)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}

	}
}
