import java.util.Scanner;
class TwistedPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num= sc.nextInt();
		/*int temp=num;
		int ld=0;
		int rev=0;
		while (temp!=0)
		{
			ld=temp%10;
			rev=rev*10+ld;
			temp/=10;
		}
		int count_N=0;
		for (int i=1;i<=num ;i++ )
		{
			if (num%i==0)
			{
				count_N++;
			}			
		}
		int count_R=0;
		for (int i=1;i<=rev ;i++ )
		{
			if (rev%i==0)
			{
				count_R++;
			}			
		}
		if (count_N==2&&count_R==2)
		{
			System.out.println("Twisted prime");
		}
		else if(count_N==2)
		{
			System.out.println("Prime but not twisted");
		}
		else
		{
			System.out.println("Neither prime nor twisted");
		} */

		int count=0;
		for (int i=1;i<=num ;i++ )
		{
			if (num%i==0)
			{
				count++;
			}
		}
		if (count==2)
		{
			int temp=num;
			int ld=0;
			int rev=0;
			while (temp!=0)
			{
				ld=temp%10;
				rev=rev*10+ld;
				temp=temp/10;
			}

			count=0;
			for (int i=1;i<=rev ;i++ )
			{
				if (rev%i==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				System.out.println("Twisted prime");
			}
			else
			{
				System.out.println("Primt but not Twisted prime");
			}
		}
		else
		{
			System.out.println("Neither prime nor twisted");
		}
	}
}
