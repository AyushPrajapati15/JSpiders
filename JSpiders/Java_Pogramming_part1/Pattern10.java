class Pattern10
{
	public static void main(String[] args) 
	{
		for (int i=5;i>=1 ;i-- )
		{
			for (int j=5;j>=1 ;j-- )
			{
				if (i+j==6)
				{		
					System.out.print(" * ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
