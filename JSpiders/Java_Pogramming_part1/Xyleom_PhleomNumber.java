import java.util.Scanner;
class Xyleom_PhleomNumber
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num= sc.nextInt();
		//to find the sum of digits in the temp because num will become zero
		int temp=num;
		int digit=0;
		int totalSum=0;
		while (temp!=0)
		{
			digit=temp%10;
			totalSum=totalSum+digit;
			temp=temp/10;
		}
		int fd=digit;
		int ld=num%10;
		int meanSum=totalSum-(fd+ld);
		if (meanSum==(fd+ld))
		{
		System.out.println("Xyleom number");
		}
		else
		{
		System.out.println("Phleon number");
		}
	}
}
