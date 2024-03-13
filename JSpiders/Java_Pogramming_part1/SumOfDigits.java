import java.util.Scanner;
class SumOfDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Hello World!");
		int num=sc.nextInt();
		int ld=0;
		int sum=0;
		while(num>0)
		{
			ld=num%10;
			sum=sum+ld;
			num=num/10;
		}
		System.out.println(sum);
	}
}