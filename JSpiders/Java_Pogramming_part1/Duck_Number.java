import java.util.Scanner;
class Duck_Number 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num= sc.nextInt();
		int count=0;
		int ld=0;
		while (num!=0)
		{
			ld=num%10;
			if (ld==0)
			{
				count++;
			}
			num=num/10;
		}
		if (count>1)
		{
			System.out.println("Duck number");
		}
		else
		{
			System.out.println("Not a duck number");
		}
	}
}
