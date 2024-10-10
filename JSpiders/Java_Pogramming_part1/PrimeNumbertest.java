import java.util.*;
class PrimeNumbertest
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();//5
		int count=0;
		for (int i=1;i<=number ;i++ )//1,2
		{
			int count=0;
			if (num%i==0)//5%1==0
			{
				count++;//1
			}
		}





 
		if (count==2)
		{
			System.out.println("prime");
		}
		else{
		System.out.println("not prime");
		}
	}
}


/*
1=1;=2
2=1,2;=2
3=1,2,3;=2
5=1,2,3,4,5[=2


5%1=0
5/2=0
5/3=0
5/4
5/5
*/