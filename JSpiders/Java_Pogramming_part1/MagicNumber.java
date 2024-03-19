import java.util.Scanner;
class MagicNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		while (num>9)//to check if the number is single digit or not
		{
			int sum=0;
			while (num!=0)//to calculate sum of the digits
			{
				sum=sum+(num%10);
				num/=10;
			}
			num=sum;
		}
		if (num==1)
		{
			System.out.println("Magic number");
		}
		else
		{
			System.out.println("Not a Magic number");
		}
	}
}