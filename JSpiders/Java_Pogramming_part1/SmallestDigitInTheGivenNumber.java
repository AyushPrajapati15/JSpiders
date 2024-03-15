import java.util.Scanner;
class SmallestDigitInTheGivenNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int ld=0;
		int smallest=num%10;
		while (num!=0)
		{
			ld=num%10;
			if (ld<smallest)
			{
				smallest=ld;
			}
			num=num/10;
		}
		System.out.println(smallest);

	}
}
