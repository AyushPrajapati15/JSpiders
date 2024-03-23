// A number in which is unique i.e all the digits in the number should not repeat.
import java.util.Scanner;
class uniqueNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int ld=0;
		int temp=num;
		int x=0;
		boolean isUnique=true;
		while (temp>9)
		{
			ld=temp%10;
			num=num/10;
			int pointer=num;
			while (pointer!=0)
			{
				x=pointer%10;
				if (ld==x)
				{
					isUnique=false;
					break;
				}
				pointer/=10;
			}
			temp=temp/10;
		}
		if (isUnique)
		{
			System.out.println("Unique number");
		}
		else
		{
			System.out.println(ld);
			System.out.println("not an Unique number");
		}
	}
}
