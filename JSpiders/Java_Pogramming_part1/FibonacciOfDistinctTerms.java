//0,1,2,3,5,8,13,21,34,55
class FibonacciOfDistinctTerms 
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		int sum=0;
		for (int i=1;i<=10;i++)
		{
			System.out.println(sum);
			sum=a+b;
			a=b;
			b=sum;
		}
	}
}
