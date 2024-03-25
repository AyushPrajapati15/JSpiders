class NumberToDecimal 
{
	public static void main(String[] args) 
	{
		int n=13;
		/*String s="";
		while (n!=0)
		{
			int rem=n%2;
			s=rem+s;
			n/=2;
		}
		System.out.println(s);*/
		int base=1;//1000
		int ans=0;//1
		while (n!=0)//1
		{
			int rem=n%2;//1
			ans=ans+rem*base;//1000+101=1101
			base*=10;
			n/=2;
		}
		System.out.println(ans);


		/*
		int base=1;//1000
		int ans=0;//1
		while (n!=0)//1
		{
			int rem=n%2;//1
			ans=ans+rem*base;//1000+101=1101
			base*=10;
			n/=2;
		}
		System.out.println(ans);

		position of rightmost set bit
		*/
	}
}


/*
1101=13
3-0
2^0+2^1+2^2+2^3	