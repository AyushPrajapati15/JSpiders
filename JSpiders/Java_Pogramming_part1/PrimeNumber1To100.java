class PrimeNumber1To100 
{
	public static void main(String[] args) 
	{
		for (int x=1;x<=100 ;x++ )//to count the factors for the current value of x 
		{
			int count=0;
			for (int i=1;i<=x ;i++ )// to	
			{
				if (x%i==0)
				{
					count++;
				}
			}
			if (count==2)// if count value is 2 then print x
			{
				System.out.println(x);
			}
		}
	}
}
