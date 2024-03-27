import java.util.Scanner;
class ArmstrongNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int temp=num;
        int count=0;
		int ld=0;
		int sum=0;
        while (temp!=0)
        {
            count++;
            temp/=10;
        }
        temp=num;
        while (temp!=0)
        {
            int exp=1;
			ld=temp%10;
            for (int i=1;i<=count ;i++ )
            {
                exp=exp*ld;
            }
			temp/=10;
			sum=sum+exp;
        }
		if (num==sum)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not an Armstrong number");
		}
    }
}
