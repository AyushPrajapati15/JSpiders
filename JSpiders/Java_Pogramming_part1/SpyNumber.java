import java.util.Scanner;
class SpyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		int prod=1;
		int ld=0;
		/*
		<!-- OTHER LOGIC -->
		for (int i=num;i!=0 ;i=i/10 )
		{
			sum+=(i%10);
			prod*=(i%10);
		}*/
		while (num!=0)
		{
			ld=num%10;
			sum=sum+ld;
			prod=prod*ld;
			num=num/10;
		}
		if (sum==prod)
		{
			System.out.println("Spy number");
		}
		else
		{
			System.out.println("Not a SPY number");
		}
	}
}
