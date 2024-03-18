import java.util.Scanner;
class TechNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int temp=num;

		int count=0;
		while (temp!=0)
		{
			count++;
			temp/=10;
		}
		int digit=1;
		if (count%2==0)
		{
			for (int i=1;i<=count/2 ;i++ )
			{
				digit=digit*10;
			}
			int fh=num/digit;
			int sh=num%digit;
			int sum=fh+sh;
			if (sum*sum==num)
			{
				System.out.println("Tech number");
			}
			else
			{
				System.out.println("Not a tech number");
			}
		}
		else
		{
			System.out.println("Not a tech number");
		}
	}
}
