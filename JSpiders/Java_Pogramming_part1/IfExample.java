import java.util.Scanner;
class IfExample
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		int rem=num%2;
		if (rem==0)
		{
		System.out.println("Hello");
		}
	}
}