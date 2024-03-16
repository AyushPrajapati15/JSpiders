import java.util.Scanner;
class FirstNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int ld=0;
		while (num!=0)
		{
			ld=num%10;
			num=num/10;
		}
		System.out.println(ld);
	}
}
