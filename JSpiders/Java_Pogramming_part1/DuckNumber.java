import java.util.Scanner;
class DuckNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int temp=num;
		int ld=0;
		boolean isZeroPresent=false;
		while (temp!=0)
		{
			ld=temp%10;
			if (ld==0)
			{
				isZeroPresent=true;
				break;
			}
			temp=temp/10;
		}
		if (isZeroPresent==true||num==0)
		{
			System.out.println("Duck number");
		}
		else
		{
			System.out.println("Not duck number");
		}
	}
}
