import java.util.Scanner;
class SumOfFactorialOfdigit
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int ld=0;
		int sum=0;
		while (num!=0)
		{
			ld=num%10;
			int fact=1;
			for (int i=1;i<=ld ;i++ )
			{
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		System.out.println(sum);
	}
}
