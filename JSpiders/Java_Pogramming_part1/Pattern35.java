/*
1  7  12  16  19  21
 2  8  13  17  20
 3  9  14  18
 4  10  15
 5  11
 6
*/

class Pattern35 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=6 ;i++ )
		{
			int b=i;
			for (int a=6;a>=1 ;a-- )
			{

				if (i<=a)
				{
					
						System.out.print(" "+b+" ");
						b=b+a;
				}
			}
			System.out.println();
		}
	}
}
