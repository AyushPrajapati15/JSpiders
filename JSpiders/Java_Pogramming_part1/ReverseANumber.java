import java.util.Scanner;
class ReverseANumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int rev=0;
		int ld=0;
		while (num!=0)
		{
			ld=num%10;
			rev=rev*10+ld;
			num=num/10;
		}
		System.out.println(rev);
	}
}
