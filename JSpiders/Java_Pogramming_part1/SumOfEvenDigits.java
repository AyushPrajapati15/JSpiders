import java.util.Scanner;
class SumOfEvenDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int ld=0;
		int sum=0;
		while (num!=0)
		{
			ld=num%10;
			if (ld%2==0)
			{
				sum=sum+ld;
			}
				num=num/10;
		}
		System.out.println(sum);
	}
}
