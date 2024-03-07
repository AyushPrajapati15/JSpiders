import java.util.Scanner;
class IasEligibility 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=scan.nextInt();
		if (age>=21&&age<=32)
		{
			System.out.println("You are eligible for IAS exam");
		}
		else
		{
			System.out.println("You are not eligible for IAS exam");
		}
	}
}
