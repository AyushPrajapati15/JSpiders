import java.util.Scanner;
class CountSetOfBitsInInteger
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int base=1;
		int ans=0;
		int rem=0;
		int count=0;
		while (num!=0)
		{
			rem=num%2;
			ans=ans+rem*base;
			base*=10;
			num/=2;
		}
		while (ans!=0)
		{
			if (ans%10==1)
			{
				count++;
			}
			ans/=10;
		}
		System.out.println(count);
	}
}
