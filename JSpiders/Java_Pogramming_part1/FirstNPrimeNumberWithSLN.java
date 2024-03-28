//WAPTP First N Prime Number
import java.util.Scanner;
class FirstNPrimeNumberWithSLN 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int sln=1;
		for (int x=1;sln<=n ;x++ )
		{
			int count=0;
			for (int i=1;i<=x ;i++ )
			{
				if (x%i==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				System.out.println(sln+")"+x);
				sln++;
			}
		}
	}
}
