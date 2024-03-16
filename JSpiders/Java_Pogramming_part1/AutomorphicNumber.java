import java.util.Scanner;
class AutomorphicNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int square=num*num;
		boolean isDigitSame=true;//assume the digits are same
		while (num!=0)//iterate until the number becomes 0
		{
			if (num%10!=square%10)//to check the ld of number and square are same or not
			{
				isDigitSame=false;//if the ld is not matched break the loop 
				break;
			}
			num/=10;
			square/=10;
		}
		if (isDigitSame)// to print the number if automorphic or not
		{
			System.out.println("Automorphic number");
		}
		else
		{
			System.out.println("Not an Automorphic number");
		}
	}
}
