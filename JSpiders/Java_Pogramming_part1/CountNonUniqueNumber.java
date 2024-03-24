import java.util.Scanner;
class CountNonUniqueNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();//1223345
		int temp=0;
		int count=0;
		boolean isUnique=true;
		while (num!=0)
		{
			temp=num/10;
			int ld1=num%10;

			while (temp!=0)
			{
				int ld2=temp%10;
				if (ld1==ld2)
				{
					isUnique=false;
					break;
				}
					temp/=10;
			}
			if (isUnique)
			{
				count++;
			}
			num/=10;
		}
		System.out.println(count);
	}
}
