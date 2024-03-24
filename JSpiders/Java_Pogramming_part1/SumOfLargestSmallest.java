import java.util.Scanner;
class SumOfLargestSmallest
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();//12345
		int temp=num;
		int ld=0;
		int smallest=temp%10;
		int largest=temp%10;
		while (temp!=0)
		{
			ld=temp%10;
			if (ld>largest)
			{
				largest=ld;
			}
			if (ld<smallest)
			{
				smallest=ld;
			}
			temp/=10;
		}
		temp=num;
		int seclar=temp%10;
		int secsmal=temp%10;
		while (temp!=0)
		{

			ld=temp%10;
			if (ld>seclar&&ld<largest)
			{
				seclar=ld;
			}
			if (ld<secsmal&&ld>smallest)
			{
				secsmal=ld;
			}
			temp/=10;
		}
		System.out.println(seclar);
		System.out.println(secsmal);
		System.out.println(seclar+secsmal);
	}
}
