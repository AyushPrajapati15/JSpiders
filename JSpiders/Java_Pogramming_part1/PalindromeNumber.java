import java.util.Scanner;
class PalindromeNumber 
{
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int temp=num;
		int ld=0;
		int rev=0;
		while (temp!=0)
		{
			ld=temp%10;
			rev=rev*10+ld;
			temp=temp/10;
		}
		if (num==rev)
		{
			System.out.println("Palindrome number");
		}
		else
		{
			System.out.println("Not a Palindrome number");
		}
	}
}
