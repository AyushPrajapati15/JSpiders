import java.util.Scanner;
class BouncyNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		boolean isBouncy=true;
		while (num!=0)
		{
			int ld1=num%10;
			int temp1=num/10;
			while (temp1!=0)
			{
				int ld2=temp1%10;
				if (ld1<=ld2||ld2<=ld1)
				{
				}
			}
		}
	}
}
