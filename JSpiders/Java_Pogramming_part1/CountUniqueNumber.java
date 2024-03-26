import java.util.Scanner;
class CountUniqueNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();//
		int original = num;
		int count=0;//2
		boolean isUnique=true;
		while (num!=0)//12233//1223
		{
			int ld1=num%10;//3
			int temp=original;//1223
			int count2 = 0;
			while (temp!=0)//1223
			{
				int ld2=temp%10;//3
				if (ld1==ld2)
				{
					count2++;
				}
				temp/=10;
			}
			if (count2==1)
			{
				count++;
			}
			num/=10;
		}
		System.out.println(count);
	}
}