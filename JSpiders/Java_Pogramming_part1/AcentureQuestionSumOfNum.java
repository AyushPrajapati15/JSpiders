import java.util.Scanner;
class AccentureQuestionSumOfNum 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter m and n");
		int m=sc.nextInt();//6
		int n=sc.nextInt();//30
		int sum=0,sum1=0,sum2=0;
		for (int i=1;i<=n ;i++ )
		{
			if (i%m==0)
			{
				sum1+=i;
			}
			else{
				sum2+=i;
			}
		}
		sum=sum1-sum2;
		if (sum<0)
		{
			
			System.out.println(sum*-1);
		}
		else{
			
			System.out.println(sum);
		}
	}
}
