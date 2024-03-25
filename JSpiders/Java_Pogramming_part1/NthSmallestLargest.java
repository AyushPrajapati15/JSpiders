import java.util.Scanner;
class NthSmallestLargest 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();//34785
		int n=sc.nextInt();
		int ld1=0;
		int ld2=0;
		int secondLargest=0;
		int secondSmallest=0;
		int temp1=num;
		while (temp1!=0)
		{
			ld1=temp1%10;
			int temp2=num;
			int count1=0;
			int count2=0;
			while (temp2!=0)
			{
				ld2=temp2%10;
				if (ld2>ld1)
				{
					count1++;
				}
				if (ld2<ld1)
				{
					count2++;
				}
				temp2/=10;
			}
			if (count1==(n-1))
			{
				secondLargest=ld1;
			}
			if (count2==1)
			{
				secondSmallest=ld1;
			}
			temp1/=10;
		}

		System.out.println(secondLargest+secondSmallest);
		System.out.println(secondLargest);
		System.out.println(secondSmallest);
	}
}