import java.util.Scanner;
class ExponentialOfSmallestDigitsToLargestTimes 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int smallest=num%10;
		int largest=num%10;
		int ld=0;
		int exp=1;
		while (num!=0)
		{
			ld=num%10;
			if (ld>largest)
			{
				largest=ld;
			}
			if (ld<smallest)
			{
				smallest=ld;
			}
			num=num/10;
		}
		for (int i=1;i<=largest ;i++ )
		{
			exp=exp*smallest;
		}
		System.out.println(exp);
	}
}

