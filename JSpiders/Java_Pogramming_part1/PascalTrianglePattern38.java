class PascalTrianglePattern38
{
	public static void main(String[] args) 
	{
		int space=5;
		int star=1;
		for (int i=1;i<=6 ;i++ )
		{
			for (int a=1;a<=space ;a++ )
			{
				System.out.print("  ");
			}

			/*
			int x=1;
			for(int b=2;b<=star;b++)
			{
				x=(x*(1-b))/b;
			}

			*/
			int x=1;
			int nu=i-1;
			int dn=1;
			for (int b=1;b<=star ;b++ )
			{
				System.out.print(+x+"   ");
				x=(x*nu)/dn;
				nu--;
				dn++;
			}
			star++;
			space--;
			System.out.println();
		}
	}
}
