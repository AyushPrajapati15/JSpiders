/*
       1
    1  4  1
 1  4  9  4  1
    1  4  1
       1
*/

class Pattern36 
{
	public static void main(String[] args) 
	{
		int space=2;
		int star=1;
		for (int i=1;i<=5 ;i++ )
		{
			for (int a=1;a<=space ;a++ )
			{
				System.out.print("   ");
			}
			for (int b=1;b<=star ;b++ )
			{
				if (b==3&&i==3)
				{
					System.out.print(" 9 ");
				}
				else if (b==1||b==star)
				{
					System.out.print(" 1 ");
				}
				else if (b==2||b==star-1)
				{
					System.out.print(" 4 ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			if (i<=2)
			{
				space--;
				star+=2;
			}
			else
			{
				space++;
				star-=2;
			}
			System.out.println();
		}
	}
}
