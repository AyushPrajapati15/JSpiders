import java.util.Scanner;
class  QuadrantPoint
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the co-ordinates of 'X' and 'Y' axis");
		int x=sc.nextInt();
		int y=sc.nextInt();
		if (x>0&&y>0)
		{
			System.out.println("The point lies in 1'St Quadrants");
		}
		else if (x<0&&y>0)
		{
			System.out.println("The point lies in 2'St Quadrants");
		}
		else if (x<0&&y<0)
		{
			System.out.println("The point lies in 3'St Quadrants");
		}
		else if (x>0&&y<0)
		{
			System.out.println("The point lies in 4'St Quadrants");
		}
		else if (x==0&&y==0)
		{
			System.out.println("The point lies on origin");
		}
		else if (y==0)
		{
			System.out.println("The point lies in 'x' axis");
		}
		else if (x==0)
		{
			System.out.println("The point lies in 'y' axis");
		}
			
	}
}
