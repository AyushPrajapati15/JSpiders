import java.util.Scanner;
class TriangleTypes 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three sides of a triangle");
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		int s3=sc.nextInt();
		if (s1==s2&&s2==s3)
		{
			System.out.println("Equilateral Triangle");
		}
		else if (s1==s2||s2==s3||s1==s3)
		{
			System.out.println("Isosceles Triangle");
		}
		else
		{
			System.out.println("Scalene triangle");
		}
	}
}
