/*
*****
****
***
**
*


*/
class Pattern34
{
	public static void main(String[] args) 
	{
		int b=10;

		for (int i=1;i<=4 ;i++ )
		{
			for (int a=4;a>=1 ;a-- )
			{
				if (i<=a)
				{
					while(true)
					{
						b++;
					int count=0;
					for (int c=1;c<=b ;c++ )
					{
						if (b%c==0)
						{
							count++;
						}
					}
					if (count==2)
					{
						System.out.print(b+" ");
						break;
					}
					}
				}
			}
			System.out.println();

		}
	}
}
















/*
	/*
	*****
	****
	***
	**
	*


	*/
	/*
	class Pattern34
	{
		public static void main(String[] args) 
		{
			int count=0;
			for (int b=10;b<=43 ;b++ )
			{
				count=0;
				for (int c=1;c<=b ;c++ )
				{
					if (b%c==0)
					{
						count++;
					}
				}
				if (count==2)
				{
					for (int i=1;i<=5 ;i++ )
					{
						for (int a=5;a>=1 ;a-- )
						{
							if (i<=a)
							{	
								System.out.print(b+" ");
							}
						}
						System.out.println();
					}
				}
			}
		}
	}
	*/