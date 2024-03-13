import java.util.Scanner;
class ProductOfDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=12345;
		int prod=1;
		int ld=1;
		/*
		<!-- OTHER LOGIC -->
		for(int i=n;i!=0;i=n/10)
		{
			ld=i%10;
			prod=prod*ld;
			prod*=(i%10);
		}*/
		while(n!=0)
		{
			ld=n%10;
			prod=prod*ld;
			n=n/10;
		}
		System.out.println(prod);
	}
}
