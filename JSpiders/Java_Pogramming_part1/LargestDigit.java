import java.util.Scanner;
class LargestDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int ld=0;
		int largest=num%10;
		while (num!=0)
		{
			ld=num%10;
			if (ld>largest)
			{
				largest=ld;
			}
			num/=10;
		}
		System.out.println(largest);
	}
}
