import java.util.Scanner;
class StrongNumber 
//the sum of factorial of digits of a given number is equal to the number then it is strong number.
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num =sc.nextInt();
		int ld=0;
		int sum=0;
		int temp=num;
		while (num!=0) // to iterate the number
		{
			ld=num%10;
			int fact=1;
			for (int i=1;i<=ld ;i++ ) // to find the factorial of the number
			{
				fact=fact*i;
			}
			sum=sum+fact; // to find the sum of factorial 
			num=num/10;
		}
		if (temp==sum) // to compare whether the sum is equal to the original number or not.
		{
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("Not a Strong Number");
		}
	}
}
