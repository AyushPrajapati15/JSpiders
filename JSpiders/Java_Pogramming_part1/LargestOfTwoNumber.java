import java.util.Scanner;
class  LargestOfTwoNumber
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=scan.nextInt();
		System.out.println("Enter Second number");
		int num2=scan.nextInt();
		if (num1>num2)
		{
		System.out.println("Larger number is: "+num1);
		}
		else
		{
			System.out.println("Larger number is: "+num2);
		}
	}
}
