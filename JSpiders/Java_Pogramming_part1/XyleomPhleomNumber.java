import java.util.Scanner;
class XyleomPhleomNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int temp=num;
		int sum1=0;
		int sum2=0;
		int ld=0;
		while (temp!=0)// to iterate each digit in the given number
		{
			ld=temp%10;
			if (temp<10||temp==num) // to filter first and last digit
			{
				sum1=sum1+ld;
			}
			else
			{
				sum2=sum2+ld;
			}
			temp=temp/10;
		}
		if (sum1==sum2) // to check the number is xyleom or phleom
		{
			System.out.println("Xyleom number");
		}
		else
		{
			System.out.println("Phleom number");
		}
	}
}
