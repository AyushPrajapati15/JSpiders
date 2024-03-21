// A bumber is called sunny if the num+1 is a perfect square
import java.util.Scanner;

class SunnyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter a number");
		int n=sc.nextInt();
		boolean isSunny=false;
		//for(int i=1;i*i<=n+1;i++)
		for (int x=1;x*x<=n+1 ;x++ )
		{
			if ((x*x)==n+1)
			{
				isSunny=true;
				break;
			}
		}
		if (isSunny)
		{
			System.out.println("Sunny Number");
		}
		else
		{
			System.out.println("Not a Sunny Number");
		}
	}
}
