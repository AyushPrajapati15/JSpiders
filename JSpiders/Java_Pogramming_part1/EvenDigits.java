import java.util.Scanner;
class EvenDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int ld=0;
		while (num!=0)
		{
			ld=num%10;
			if (ld%2==0)
			{
				System.out.println(ld);
			}
			num=num/10;
		}
	}
}
