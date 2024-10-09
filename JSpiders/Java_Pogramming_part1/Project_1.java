import java.util.Scanner;
class Project_1 
{
	public static boolean couponCheck(int x)
	{
		int sum=0;
		int temp=x;
		while (temp!=0)	
		{
			sum=sum+(temp%10);
			temp/=10;
		}
		if (sum==20&&x%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("#############################");
		System.out.println("        Welcome to");
		System.out.println("   Dream Styles And Fashion");
		System.out.println("#############################");
		System.out.print("Enter your bill : ");
		double bill=sc.nextDouble();
		System.out.println("In this super sale offer you get a discount of 10%");
		double payableBill=bill*0.9;
		System.out.println("Your Payable bill is : "+payableBill);
		System.out.println("Are you our regular customer");
		System.out.println("Enter true if yes");
		System.out.println("Enter false if no");
		System.out.println("Enter your choice :");
		boolean isRegular=sc.nextBoolean();
		if (isRegular==true)
		{
			System.out.println("Please support us for validating your membership :");
			System.out.print("Enter the coupon code given to you : ");
			int coupon=sc.nextInt();
			boolean ans=couponCheck(coupon);
			if (ans)
			{
				System.out.println("We identified youas our regular customer");
				System.out.println("So, you get extra 10% discount on payable bill");
				double finalBill=payableBill*0.9;
				System.out.print("Your final bill is :"+finalBill);
			}
			else
			{
				System.out.println("Sorry coupon entered by you is invalid !");
				System.out.println("Your final bill is : "+payableBill);
			}
		}
		else
		{
			System.out.print("Your final bill is : "+payableBill);
		}
		//System.out.println("Thank you....|| Get lost...||| You idiot...");
		System.out.println("Thank you for shopping");

	}
}

