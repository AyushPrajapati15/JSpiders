import java.util.Scanner;
class  FinalBill
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the bill");
		double bill=sc.nextDouble();
		System.out.println("Enter the Discount");
		double discount=sc.nextDouble();
		double finalBill=bill*(100-discount)/100;
		System.out.println("The final bill is "+finalBill);
	}
}
