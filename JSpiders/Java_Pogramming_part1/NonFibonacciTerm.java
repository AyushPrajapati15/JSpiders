//4,6,7,9,10,11,12,14,15
class NonFibonacciTerm 
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		int sum=0;
		//int j=0;
		for (int i=0;i<=15 ;i++ )
		{
			//sum-0,1,2,3,5,8,13,21,34,55
			//j-  0 1 2 3 4 5 6 7 8 9
			if (sum!=i)
			{
				System.out.println(i);
				
			}
			else{
			sum=a+b;
			a=b;
			b=sum;

			} 
		}
	}
}
