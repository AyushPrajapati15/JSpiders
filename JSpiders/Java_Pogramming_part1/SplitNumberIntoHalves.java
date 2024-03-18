import java.util.Scanner;
class SplitNumberIntoHalves
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int temp=num;
		//count the of digits in the number
		int count=0;
		while (temp!=0)
		{
			count++;
			temp/=10;
		}
		//check whether number is having even or odd digit
		if (count%2==0)
		{
			int digit=1;
			//use loop to find the divior by multiplying 10 count/2 times
			for (int i=1;i<=count/2 ;i++ )
			{
				digit=digit*10;
			}
			int fh=num/digit;
			int sh=num%digit;
			System.out.println(fh);
			System.out.println(sh);
		}
		else
		{
			System.out.println("Number can't be split");
		}
	}
}
